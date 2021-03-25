package com.test.sample.intandstring;

public class MainDriver {

    public static void main(String[] args) {
//        StringToint("23");
        IntToString(23);
        myAtoi("23");

        System.out.println(Integer.parseInt("34"));
        System.out.println(String.valueOf(34));
    }

    public static int StringToint(String number) {

        int eachnumber = 0;
        int intConvert = 48;
        int reVal = 0;
        int index;
        int maxlen = number.length() - 1;
        for (index = 0; index <= maxlen; index++) {
            eachnumber = number.charAt(index);

            eachnumber = eachnumber - intConvert;

            reVal = reVal + (eachnumber * (int) Math.pow(10, maxlen - index));
        }
        return reVal;

    }

    public static int myAtoi(String str) {
        int i = 0;
        int sign = 1;
        int result = 0;
        if (str.length() == 0) return 0;

        //Discard whitespaces in the beginning
        while (i < str.length() && str.charAt(i) == ' ')
            i++;

        // Check if optional sign if it exists
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-'))
            sign = (str.charAt(i++) == '-') ? -1 : 1;

        // Build the result and check for overflow/underflow condition
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return result * sign;

    }


    public static String IntToString(int number) {
        int StringConvet = 48;

        int eachDigit = number;
        int afterDivide = number;
        String reVal = "";

        while (afterDivide > 0) {
            eachDigit = afterDivide % 10;
            afterDivide = afterDivide / 10;
            if (eachDigit == 0) {
                reVal += "0";
            } else if (eachDigit == 1) {
                reVal += "1";
            } else if (eachDigit == 2) {
                reVal += "2";
            } else if (eachDigit == 3) {
                reVal += "3";
            } else if (eachDigit == 4) {
                reVal += "4";
            } else if (eachDigit == 5) {
                reVal += "5";
            } else if (eachDigit == 6) {
                reVal += "6";
            } else if (eachDigit == 7) {
                reVal += "7";
            } else if (eachDigit == 8) {
                reVal += "8";
            } else if (eachDigit == 9) {
                reVal += "9";
            }
        }
        String reVal2 = "";
        for (int index = reVal.length() - 1; index >= 0; index--) {
            reVal2 += reVal.charAt(index);
        }
        return reVal2;
    }
}
