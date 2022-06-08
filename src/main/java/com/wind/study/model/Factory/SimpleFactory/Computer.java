package com.wind.study.model.Factory.SimpleFactory;

public class Computer {
    private Output out;

    public Computer(Output out) {
        this.out = out;
    }

    public void keyIn(String msg) {
        out.getDate(msg);
    }

    public void print() {
        out.out();
    }
}
