package zzalltaskfrom1to100;
class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class taskweek7_three {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        dog1.printDetails();
        dog2.printDetails();

        dog1.setName("Charlie");
        dog1.setBreed("Labrador");

        System.out.println("Updated Details of Dog 1:");
        dog1.printDetails();
    }
}

