package com.memory.management.monitoring;

import java.util.HashMap;
import java.util.Map;


//on intellij set below configurations on VM Options
//-Xms1024m -Xms1024m -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:E:/workSpace/java8/GC.log
public class JVMOutOfMemoryErrorSimulator {
    private final static int NB_ITERATION = 5000000;

    private final static String LEAKING_DATA_PREFIX = "datadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadatadata";
    // Map used to store our leaking String instances
    private static Map<String, String> leakingMap;

    static{
        leakingMap = new HashMap<String, String>();
    }

    public static void main(String[] args){

        System.out.println("JVM OutOfMemoryError Simulator 1.0");
        System.out.println("Author: Pierre-Hugues Charbonneau");
        System.out.println("http://javaeesupportpatterns.blogspot.com/");


        try{
            for (int i = 0; i < NB_ITERATION; i++){
                String data = LEAKING_DATA_PREFIX+i;

                //Add data to our leaking Map data structure
                leakingMap.put(data,data);
            }

        }catch(Throwable any){
            if (any instanceof java.lang.OutOfMemoryError) {
                System.out.println("OutOfMemoryError triggered! "+any.getMessage()+" ["+any+"]");
            } else {
                System.out.println("Unexpected Exception! "+any.getMessage());
            }
        }
    }
}
