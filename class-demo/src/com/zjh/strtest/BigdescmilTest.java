package com.zjh.strtest;

import java.math.BigDecimal;

public class BigdescmilTest {

    public static void main(String args[]) {
        BigDecimal result = new BigDecimal(1);
        System.out.println("result = " + result);
        for (int i = 1; i < 101; i++) {
            BigDecimal i_value = new BigDecimal(i);
            result = result.multiply(i_value);
        }
        System.out.println("result=" + result);
    }

}
