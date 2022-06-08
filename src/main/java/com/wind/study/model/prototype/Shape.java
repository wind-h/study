package com.wind.study.model.prototype;

public abstract class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract Double calPerimeter();

    public abstract String getType();
}
