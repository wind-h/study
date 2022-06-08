package com.wind.study.stringtest;

public class StringTest {
    public static void main(String[] args) {

        String x = "a";
        String b = "b";
        String c = "a" + "b";//常量相加
        String d = x + b;//创建了StringBuffer对象，调用了append方法，放在堆里
        System.out.println(d == c);

    }
}
