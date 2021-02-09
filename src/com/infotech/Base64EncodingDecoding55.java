package com.infotech;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64EncodingDecoding55 {

    public static void main(String[] args) {

        final String textData = "Java8 Base64 encoding-decoding!!!";
        getSimpleEncodeDecode(textData);
        System.out.println("---------------------------------------------");
        getURLEncodeDecode(textData);
        System.out.println("---------------------------------------------");
        getMimeEncodeDecode(textData);

    }

    private static void getSimpleEncodeDecode(String textData) {
        try {
            String encodedText = Base64.getEncoder().encodeToString(textData.getBytes("UTF-8"));
            System.out.println(encodedText);
            byte[] decodedArr = Base64.getDecoder().decode(encodedText);
            String decodedText = new String(decodedArr, "UTF-8");
            System.out.println(decodedText);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static void getURLEncodeDecode(String textData) {
        try {
            String encodedURL = Base64.getUrlEncoder().encodeToString(textData.getBytes("UTF-8"));
            System.out.println(encodedURL);
            byte[] decodedArr = Base64.getUrlDecoder().decode(encodedURL);
            String decodedURL = new String(decodedArr, "UTF-8");
            System.out.println(decodedURL);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static void getMimeEncodeDecode(String textData) {
        try {
            String encodedURL = Base64.getMimeEncoder().encodeToString(textData.getBytes("UTF-8"));
            System.out.println(encodedURL);
            byte[] decodedArr = Base64.getMimeDecoder().decode(encodedURL);
            String decodedURL = new String(decodedArr, "UTF-8");
            System.out.println(decodedURL);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
