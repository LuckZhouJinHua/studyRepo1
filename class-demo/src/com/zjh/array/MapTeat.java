package com.zjh.array;
import java.util.Set;
import java.util.TreeMap;

//写一个方法,统计每一个字符在字符串:AABABC 中出现的次数
public class MapTeat {
    public static void main(String[] args) {
        String str = "AABABC";
        System.out.println(charCount(str));
    }

    public static String charCount(String str) {
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        char[] chs = str.toCharArray();
        for (Character ch : chs) {
            Integer value = map.get(ch);
            if (value == null) {
                map.put(ch, 1);
            } else {
                value++;
                map.put(ch, value);
            }
        }

        Set<Character> set = map.keySet();
        StringBuilder sb = new StringBuilder();
        for (Character s : set) {
            Integer value = map.get(s);
            sb.append(s).append("(").append(value).append(")");
        }
        return sb.toString();
    }
}
