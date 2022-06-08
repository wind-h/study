package com.wind.study.Thread.CallableTest;

import java.util.concurrent.Callable;

public class Ticket implements Callable {
    private static int ticket = 100;

    public Ticket() {
    }

    @Override
    public Object call() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    String name = Thread.currentThread().getName();
                    try {
                        Thread.currentThread().sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name + ":" + "票号" + ticket);
                    ticket--;
                } else {
                    System.out.println("车票已售罄!");
                    return null;
                }
            }
        }
    }
}
