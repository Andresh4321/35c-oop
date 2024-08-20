public class shapeclass {
    public static void main(String[] args) {
        Triangle shp = new Triangle();
        Rectangle rec = new Rectangle();
        Circle cir = new Circle();
        
        System.out.println("Triangle Area: " + shp.area());
        System.out.println("Triangle Perimeter: " + shp.perimeter());
        
        System.out.println("Rectangle Area: " + rec.area());
        System.out.println("Rectangle Perimeter: " + rec.perimeter());
        
        System.out.println("Circle Area: " + cir.area());
        System.out.println("Circle Perimeter: " + cir.perimeter());
    }  
} 

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Triangle extends Shape {
    double l = 10;
    double b = 10;
    double h = 10;
    
    @Override
    double area() {
        return 0.5 * b * h;
    }
    
    @Override
    double perimeter() {
        return 3 * b;
    }
}

class Rectangle extends Shape {
    double l = 20;
    double b = 20;
    
    @Override
    double area() {
        return l * b;
    }
    
    @Override
    double perimeter() {
        return 2 * (l + b);
    }
}

class Circle extends Shape {
    double r = 22;
    
    @Override
    double area() {
        return Math.PI * r * r;
    }
    
    @Override
    double perimeter() {
        return 2 * Math.PI * r;
    }
}
