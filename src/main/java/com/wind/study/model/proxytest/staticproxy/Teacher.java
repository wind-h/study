package com.wind.study.model.proxytest.staticproxy;

public class Teacher implements Person {

    @Override
    public void run() {
        System.out.println("教师正在奔跑");
    }
}
