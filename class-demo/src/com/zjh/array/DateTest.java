package com.zjh.array;

import java.text.SimpleDateFormat;

public class DateTest {
    public static void main(String[] args) {
        long timeMillis = System.currentTimeMillis();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        String format = dateFormat.format(timeMillis);
        System.out.println(timeMillis);
        System.out.println("format = " + format);
    }
}
