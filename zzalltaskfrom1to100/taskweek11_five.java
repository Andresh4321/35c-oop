package zzalltaskfrom1to100;
abstract class Shape {
    abstract void resize(double factor);
    abstract void rotate(double degrees);
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void resize(double factor) {
        radius *= factor;
        System.out.println("Resized Circle Radius: " + radius);
    }

    @Override
    void rotate(double degrees) {
        System.out.println("Rotating Circle by " + degrees + " degrees...");
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void resize(double factor) {
        side *= factor;
        System.out.println("Resized Square Side: " + side);
    }

    @Override
    void rotate(double degrees) {
        System.out.println("Rotating Square by " + degrees + " degrees...");
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void resize(double factor) {
        base *= factor;
        height *= factor;
        System.out.println("Resized Triangle Base: " + base + ", Height: " + height);
    }

    @Override
    void rotate(double degrees) {
        System.out.println("Rotating Triangle by " + degrees + " degrees...");
    }
}

public class taskweek11_five {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 5.0);

        circle.resize(2.0);
        circle.rotate(45);

        square.resize(1.5);
        square.rotate(90);

        triangle.resize(0.5);
        triangle.rotate(30);
    }
}
