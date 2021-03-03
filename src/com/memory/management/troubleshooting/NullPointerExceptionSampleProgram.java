package com.memory.management.troubleshooting;

public class NullPointerExceptionSampleProgram {
    private String field1 = null;
    private String field2 = null;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public static void main(String[] args) {

        try {
            NullPointerExceptionSampleProgram objectInstance = new NullPointerExceptionSampleProgram();

            objectInstance.setField1("fieldValue");

            objectInstance = doSomething();

            if (objectInstance != null) {
                objectInstance.setField2("fieldValue2");
            } else {
                System.out.println("objectinstance is null, do not attempt ");
            }
        } catch (Throwable any) {
            System.out.println("Java ERROR: " + any);
            any.printStackTrace();
        }

    }

    private static NullPointerExceptionSampleProgram doSomething() {
//        return new NullPointerExceptionSampleProgram();
        return null;
    }
}
