package zzalltaskfrom1to100;
class Shape {
    public void calculateArea() {
        System.out.println("Calculating area.");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }
}

public class taskweek9_five {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Circle circle = new Circle(2.5);
        circle.calculateArea();
        circle.calculateCircumference();
    }
}

