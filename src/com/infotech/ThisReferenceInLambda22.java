package com.infotech;

import com.infotech.interfaces.Operation;

public class ThisReferenceInLambda22 {


    public void process() {
        doOperate(30, n -> {
            System.out.println(38 + n);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        int b = 90;
//        ThisReferenceInLambda22.doOperate(b, new Operation() {
//            @Override
//            public void operate(int n) {
//               System.out.println(b+n);
//               System.out.println(this);
//            }
//        });

        ThisReferenceInLambda22.doOperate(b, (int n) -> {
                    System.out.println(b + n);
                    //we are in instance of main and main is static, so there is not any this
                    //System.out.println(this);???????????????
                }
        );

        new ThisReferenceInLambda22().process();
    }

    private static void doOperate(int i, Operation opr) {
        opr.operate(i);
    }
}
