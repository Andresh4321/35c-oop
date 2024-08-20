package zzalltaskfrom1to100;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class taskweek11_six {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add two integers: " + calc.add(3, 4));
        System.out.println("Add two doubles: " + calc.add(2.5, 3.5));
        System.out.println("Add three integers: " + calc.add(1, 2, 3));
    }
}

