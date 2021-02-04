package com.infotech;

import com.infotech.interfaces.Operation;

public class ClosureInLambda21 {

    public static void main(String[] args) {
        int x = 30;
        int y = 40;

//        below code snippet can be converted to next lamda expression
//        doOperate(x, new Operation() {
//            @Override
//            public void operate(int n) {
//                System.out.println(n+y);
//            }
//        });


        doOperate(x, n -> {System.out.println(n+y);});
    }

    private static void doOperate(int i, Operation opr){
        opr.operate(i);
    }
}
