package com.wind.study.model.Singleton;

public class Singleton04 {
    private static Singleton04 singleton;
    private static Object object = new Object();

    private Singleton04() {
    }

    public static Singleton04 getSingleton() {
        if (singleton == null) {
            synchronized (object) {
                if (singleton == null) {
                    singleton = new Singleton04();
                }
            }
        }
        return singleton;
    }
}
