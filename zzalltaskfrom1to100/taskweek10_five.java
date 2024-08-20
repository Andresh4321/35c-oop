package zzalltaskfrom1to100;
abstract class Draw {
    public abstract double calculateVolume();
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Cube extends Draw {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class taskweek10_five {
    public static void main(String[] args) {
        Draw cube = new Cube(3);
        Draw cuboid = new Cuboid(4, 5, 6);
        Draw cylinder = new Cylinder(2, 7);

        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Area: " + cube.calculateArea());
        System.out.println("Cube Perimeter: " + cube.calculatePerimeter());

        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
        System.out.println("Cuboid Area: " + cuboid.calculateArea());
        System.out.println("Cuboid Perimeter: " + cuboid.calculatePerimeter());

        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
        System.out.println("Cylinder Area: " + cylinder.calculateArea());
        System.out.println("Cylinder Perimeter: " + cylinder.calculatePerimeter());
    }
}


