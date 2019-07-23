package com.zjh.array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        long timeMillis = System.currentTimeMillis();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/ShangHai"));
        String format = dateFormat.format(timeMillis);
        Date parse = dateFormat.parse("21321132131");


        System.out.println(timeMillis);
        System.out.println("format = " + format);
    }
}
