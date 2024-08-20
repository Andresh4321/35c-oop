package zzalltaskfrom1to100;
class Vehicle {
    public void drive() {
        System.out.println("The vehicle is driving.");
    }
}

class Car extends Vehicle {
    private String model;
    private String brand;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void display() {
        System.out.println("Car brand: " + brand + ", Model: " + model);
    }
}

// Example usage:
public class taskweek9_one {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.drive();
        car.display();
    }
}

