package com.memory.management.monitoring.oomThreadHeap;


//Create as many Java threads as we can, up to 5000
//on intellij set below configurations on VM Options
//-Xms512m -Xms512m -XX:PermSize=256m
//-Dcom.sun.management.jmxremore.port:8080
public class NativeOOMSimulator {
    private static final int MAX_NB_THREADS = 5000;

    public static void main(String[] args){

        System.out.println("JVM OutOfMemoryError Simulator 1.0");
        System.out.println("Author: Pierre-Hugues Charbonneau");
        System.out.println("http://javaeesupportpatterns.blogspot.com/");

        int nbThreadCreated = 0;

        try{
            for (int i=0; i<MAX_NB_THREADS; i++){
                IdleThread newJavaThread = new IdleThread();
                newJavaThread.setDaemon(true);
                newJavaThread.start();

                nbThreadCreated++;
            }
        }catch (Throwable e){
            System.out.println("ERROR while creating a new Java Thread: "+e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Java Thread Created: "+nbThreadCreated);
        }

    }
}
