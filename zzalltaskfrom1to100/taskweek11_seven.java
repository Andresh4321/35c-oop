package zzalltaskfrom1to100;
class Geometry {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return base * height; // Assuming it's a parallelogram or rectangle
        }
    }
}

public class taskweek11_seven {
    public static void main(String[] args) {
        Geometry geom = new Geometry();

        System.out.println("Area of Circle: " + geom.calculateArea(3.0));
        System.out.println("Area of Rectangle: " + geom.calculateArea(4.0, 6.0));
        System.out.println("Area of Triangle: " + geom.calculateArea(3.0, 5.0, true));
    }
}

