package com.zjh.test;

/**
 * @author Casual developer
 * @version 1.0
 * @date 2019/10/25/025 17:56
 */
public class Something {
    public static void main(String[] args) {
        Something s = new Something();
        System.out.println(Integer.toHexString(s.hashCode()));
        System.out.println("ssssss"+s.doSomething());
        System.out.println(System.getProperties());
    }
    public String doSomething(){
        return "do something";
    }
}
