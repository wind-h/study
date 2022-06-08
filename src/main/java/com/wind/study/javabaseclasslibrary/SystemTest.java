package com.wind.study.javabaseclasslibrary;

import java.util.Map;

public class SystemTest {
    public static void main(String[] args) {
        //获取环境变量
        Map<String, String> getenv = System.getenv();
        for (String s : getenv.keySet()) {
            System.out.println(s + ":" + getenv.get(s));
        }
    }
}
