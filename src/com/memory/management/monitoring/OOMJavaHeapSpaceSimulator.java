package com.memory.management.monitoring;

import java.util.HashMap;
import java.util.Map;

//on intellij set below configurations on VM Options
//-Xms256m -XX:-UseGCOverheadLimit -XX:+HeapDumpOnOutOfMemoryError -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:E:/workSpace/java8/GC.log
public class OOMJavaHeapSpaceSimulator {

    // Static Cache
    private static Map<String, OOMJavaHeapSpaceSimulator> leakContainer = new HashMap<String, OOMJavaHeapSpaceSimulator>();
    private final static String dataOrefix = "DATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATADATA";
    private final static boolean slowException = false;

    public static void main(String[] args) {
        System.out.println("Start..\n");

        try {
//            for (int i = 0; i < 10000000; i++) {
            for (int i = 0; i < 100000; i++) {
                String data = dataOrefix + i;
                leakContainer.put(data, new OOMJavaHeapSpaceSimulator());

                if (slowException)
                    try {
                        Thread.sleep(1);
                    } catch (Exception ignore) {

                    }
            }
        } catch (Throwable e) {
            System.out.println("OOMJavaHeapSpaceSimulator Failure! --> " + e);
            throw e;
        }
        System.out.println("\n--END--");
    }
}
