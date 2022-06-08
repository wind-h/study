package com.wind.study.Thread.CallableTest;

import java.util.LinkedList;
import java.util.concurrent.FutureTask;

public class test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        FutureTask ft1 = new FutureTask(ticket);
        FutureTask ft2 = new FutureTask(ticket);
        FutureTask ft3 = new FutureTask(ticket);
        new Thread(ft1).start();
        new Thread(ft2).start();
        new Thread(ft3).start();
        LinkedList x = new LinkedList();
    }
}
