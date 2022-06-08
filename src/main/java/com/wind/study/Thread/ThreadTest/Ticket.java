package com.wind.study.Thread.ThreadTest;

public class Ticket extends Thread {
    private static Integer ticket = 100;
    private static final Object obj = new Object();

    public Ticket() {
    }

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    String name = Thread.currentThread().getName();
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name + ":" + "票号" + ticket);
                    ticket--;
                } else {
                    System.out.println("车票已售罄!");
                    return;
                }
            }
        }
    }
}
