package zzalltaskfrom1to100;
abstract class Vehicle {
    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    @Override
    double calculateRentalCost(int days) {
        return days * 50; // $50 per day
    }
}

class Motorcycle extends Vehicle {
    @Override
    double calculateRentalCost(int days) {
        return days * 30; // $30 per day
    }
}

class Bicycle extends Vehicle {
    @Override
    double calculateRentalCost(int days) {
        return days * 10; // $10 per day
    }
}

public class taskweek11_three {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bicycle = new Bicycle();

        System.out.println("Car Rental Cost for 5 days: $" + car.calculateRentalCost(5));
        System.out.println("Motorcycle Rental Cost for 3 days: $" + motorcycle.calculateRentalCost(3));
        System.out.println("Bicycle Rental Cost for 7 days: $" + bicycle.calculateRentalCost(7));
    }
}

