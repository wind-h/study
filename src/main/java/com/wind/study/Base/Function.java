package com.wind.study.Base;

import static java.lang.System.out;

public class Function {
    int x;
    int y;

    public Function() {

    }

    public Function(int x) {
        this.x = x;
    }

    public Function(int x, int y) {
        this(x);
        this.y = y;
    }

    public static void duoTest(int x, String... name) {
        for (String s : name) {
            out.println("s = " + s);
        }
    }

    public static void main(String[] args) {
        duoTest(1, "2", "3", "4", "5");
        int x = 1;
        System.out.println("x = " + x);
        Function02 y;
        float a = 0.3F;
        long b = (long) a;
        double c = 3L;

    }
}

class Function02 extends Function {
    //方法重载
    public void test(int x, int y) {

    }

    public void test(int x, String y) {

    }

    public static void main(String[] args) {
        /*Integer x = 4;
        Integer y = 4;
        Integer a = 128;
        Integer b = 128;
        out.println(x.toString()+y.toString());
        out.println(a.toString()+b.toString());
        final Function xx = new Function();
        xx.x = 4;
        xx.x = 5;
        out.println(xx.x);
        xx.getClass();*/
        for (int i = 0; i < 4; i++) {
            new Function();
            System.gc();
        }

    }

    public void finalize() {
        out.println("系统正在回收");
    }
}
