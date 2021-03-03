package com.memory.management.monitoring.permGen;

import java.lang.reflect.Proxy;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

//on intellij set below configurations on VM Options
//-verbose:gc -verbose:class -Xmx1024M -XX:PermSize=128m -XX:MaxPermSize=128m -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:E:/workSpace/gcMetaDataLeak.log
public class ClassMetadataLeakSimulator {

    private static Map<String, ClassA> classLeakingMap = new HashMap<String, ClassA>();
    private final static int NB_ITERATIONS_DEFAULT = 5000000;
    public static void main(String[] args) {

        System.out.println("Class metadata leak Simulator");
        System.out.println("Author: Pierre-Hugues Charbonneau");
        System.out.println("http://javaeesupportpatterns.blogspot.com/");

        int nbIterations = (args != null && args.length == 1)? Integer.parseInt(args[0]): NB_ITERATIONS_DEFAULT;

        try{
            for (int i=0; i< nbIterations; i++){
                String fictiousClassLoaderJAR = "file:"+i+".jar";
                URL[] fictiousClassLoaderURL = new URL[]{new URL(fictiousClassLoaderJAR)};

                // Create a new classloader instance
                URLClassLoader newClassLoader = new URLClassLoader(fictiousClassLoaderURL);

                //create a new Proxy instance
                ClassA t = (ClassA) Proxy.newProxyInstance(newClassLoader, new Class<?>[]{ClassA.class}, new ClassAInvocationHandler(new ClassAImpl()));

                //Add the new Proxy instance to the leaking HashMap
                classLeakingMap.put(fictiousClassLoaderJAR, t);
                Thread.sleep(1);
            }
        } catch(Throwable any){
            System.out.println("ERROR: "+any);
        }
    }

}
