package com.wind.study.Thread.ThreadTest;

public class test {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        t1.start();
        t2.start();
        t3.start();
    }
}
