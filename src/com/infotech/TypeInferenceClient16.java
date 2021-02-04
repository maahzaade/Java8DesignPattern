package com.infotech;

import com.infotech.interfaces.TypeInferenceInterface;

public class TypeInferenceClient16 {
    public static void main(String[] args){
        //no need to specify type of p1 and p2
        TypeInferenceInterface inferenceInterface = (p1, p2) -> p1>p2;

        boolean compare = inferenceInterface.compare(40, 30);
        System.out.println(compare);
    }
}
