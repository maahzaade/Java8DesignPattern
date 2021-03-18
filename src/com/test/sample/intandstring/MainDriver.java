package com.test.sample.intandstring;

public class MainDriver {

    public static void main(String[] args) {
        StringToint("23");
        IntToString(23);
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
