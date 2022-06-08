package com.wind.study.model.prototype;

public class Triangle extends Shape {
    private Double a;
    private Double b;
    private Double c;

    public Triangle(String color, Double a, Double b, Double c) {
        super(color);
        setSize(a, b, c);
    }

    public void setSize(Double a, Double b, Double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("两边之和要大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override//周长
    public Double calPerimeter() {
        return a + b + c;
    }

    @Override//形状
    public String getType() {
        return "三角形";
    }
}
