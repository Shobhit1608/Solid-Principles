package com.SOLIDPrinciples;

//Open -closed Principle 

interface Shape {
    double area();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class AreaCalculator {
    public double calculate(Shape shape) {
        return shape.area();
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Circle Area: " + calculator.calculate(circle));
        System.out.println("Rectangle Area: " + calculator.calculate(rectangle));
    }
}
