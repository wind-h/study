package com.wind.study.model.proxytest.staticproxy;

public class ProxyTeacher implements Person {
    private Teacher teacher;

    public ProxyTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void run() {
        System.out.println("开始奔跑");
        teacher.run();
        System.out.println("奔跑结束");
    }
}
