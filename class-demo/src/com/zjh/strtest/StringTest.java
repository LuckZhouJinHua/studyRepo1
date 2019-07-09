package com.zjh.strtest;

public class StringTest {
    public static void main(String[] args) {
        String[] fields = new String[]{"journal","publisher","platform","printISSN","onlineISSN","reportingPeriodTotal",
                "reportingPeriodHTML","reportingPeriodPDF","jan","feb",
                "mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};

        for (int i = 0; i < fields.length; i++) {
            String o = fields[i].split("o")[0];
            System.out.println("o = " + o);
        }
    }
}
