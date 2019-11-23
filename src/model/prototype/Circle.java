package model.prototype;

public class Circle extends Shape {
    private Double radius;
    public Circle(String color, Double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public Double calPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String getType() {
        return "圆形";
    }
}
