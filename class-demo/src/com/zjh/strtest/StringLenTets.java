package com.zjh.strtest;

import java.io.UnsupportedEncodingException;

public class StringLenTets {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "abc世界和平";

        int length = str.length();
        System.out.println("length = " + length);

        byte[] bytes = str.getBytes();
        int length1 = bytes.length;
        System.out.println("length1 = " + length1);
    }
}
