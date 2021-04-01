package com.test.sample.JustCode;/*
 * Created by Mahdiye on 2021, Mar, 25
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.sum("99.35", "1.10"));
    }

    static String sum(String... numbers) {
        double total = 0;

        for (String number : numbers) {
            total = total + Double.parseDouble(number);
        }

        return String.valueOf(total);
    }
}
