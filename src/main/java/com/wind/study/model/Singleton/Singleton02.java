package com.wind.study.model.Singleton;

public class Singleton02 {
    private static Singleton02 singleton;

    private Singleton02() {
    }

    static {
        singleton = new Singleton02();
    }

    public static Singleton02 getSingleton() {
        return singleton;
    }

}
