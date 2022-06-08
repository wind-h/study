package com.wind.study.lambda;

interface EatTaste {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}

interface Change {
    String change(int x);
}

public class LambdaTest {
    public void eat(EatTaste e) {
        System.out.println(e);
        e.taste();
    }

    public void drive(Flyable f) {
        System.out.println("f = " + f);
        f.fly("........");
    }

    public void test(Addable a) {
        System.out.println("a = " + a.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaTest lambda = new LambdaTest();
        lambda.eat(() -> {
            System.out.println("好吃");
        });
        lambda.drive(weather -> {
            System.out.println("weather = " + weather);
        });
        lambda.test((a, b) -> {
            int c = a + b;
            //System.out.println("c = " + c);
            return c;
        });
        EatTaste e = () -> {
            System.out.println("这是一个吃的任务");
        };
        e.taste();
        Change c = x -> String.valueOf(x);
        ;
        Change c1 = String::valueOf;
        String change = c.change(34);
        System.out.println("change = " + change);
    }
}
