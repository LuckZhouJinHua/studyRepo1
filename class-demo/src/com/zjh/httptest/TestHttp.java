package com.zjh.httptest;

/**
 * @author Casual developer
 * @version 1.0
 * @date 2019/8/23/023 9:39
 */
public class TestHttp {
    public static void main(String[] args) throws Exception {
        String s = HttpUtils.sendGet("https://www.baidu.com", "wd=java");
        System.out.println("s = " + s);

    }
}
