package com.wind.study.innerclass;

public class Cow {
    private double weight;

    public Cow() {
    }

    public Cow(double weight) {
        this.weight = weight;
    }

    public class CowLeg {
        private double length;
        private String color;

        public CowLeg() {
        }

        public CowLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }

        public void info() {
            System.out.println("color:" + color + " length:" + length + " weight:" + weight);
        }
    }

    public void test() {
        CowLeg cowleg = new CowLeg(1.2, "red");
        cowleg.info();
    }

    public static void main(String[] args) {
        Cow x = new Cow();
        x.test();
    }
}

class test {
    public static void main(String[] args) {
        Cow x = new Cow();
        Cow.CowLeg y = x.new CowLeg();
    }
}
