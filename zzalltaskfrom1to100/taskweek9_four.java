package zzalltaskfrom1to100;
class Vehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Driving the car.");
    }
}

class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Riding the motorcycle.");
    }
}

public class taskweek9_four {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();
        car.stopEngine();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.ride();
        motorcycle.stopEngine();
    }
}


