package com.wind.study.model.Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
