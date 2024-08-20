package zzalltaskfrom1to100;
class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car is not available.");
        }
    }

    public void returnCar() {
        isAvailable = true;
        System.out.println("Car returned successfully.");
    }
}

public class taskweek8_five {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 50.0);
        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Rental price per day: $" + car.getRentalPricePerDay());

        car.rentCar();
        System.out.println("Is car available? " + car.isAvailable());

        car.returnCar();
        System.out.println("Is car available? " + car.isAvailable());
    }
}


