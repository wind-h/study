package com.wind.study.innerclass;

interface X {
    void x1();
}

class Y {
    public void y1() {

    }
}

public class anonymous {
    public void testx(X x) {
        x.x1();
    }

    public void testy(Y y) {
        y.y1();
    }

    public static void main(String[] args) {
        anonymous x = new anonymous();
        x.testx(new X() {
            @Override
            public void x1() {
                System.out.println('x');
            }
        });
        x.testy(new Y() {
            @Override
            public void y1() {
                System.out.println("y");
            }
        });
        final int age = 1;
        Y y = new Y() {
            @Override
            public void y1() {
                System.out.println(age);
            }
        };
        y.y1();
    }
}
