package zzalltaskfrom1to100;

import java.util.Scanner;

public class taskweek4 {

    // 1. Greet Name 5 Times
    public static void greetName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + name);
        }
    }

    // 2. Miles to Kilometers Table
    public static void milesToKilometers() {
        System.out.println("Miles    Kilometers");
        for (int mile = 1; mile <= 10; mile++) {
            double kilometers = mile * 1.609;
            System.out.printf("%d    %.3f%n", mile, kilometers);
        }
    }

    // 3. Number and Square Table
    public static void numberAndSquare() {
        System.out.println("Number    Square");
        for (int number = 10; number >= 1; number--) {
            System.out.printf("%d    %d%n", number, number * number);
        }
    }

    // 4. Generate Square of *
    public static void generateSquareOfStars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Sum of Integers with option to continue
    public static void sumOfIntegersWithOption() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter a positive non-zero integer: ");
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Sum of 1 to " + n + " is " + sum);

            System.out.print("Do you want to continue? Enter ‘y’ for yes or any other character for no: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    // 6. Generate Triangle of *
    public static void generateTriangleOfStars() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 7. Calculate HCF
    public static void calculateHCF() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("The HCF is " + num1);
    }

    // 8. Reverse the digits of an integer
    public static void reverseDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number is " + reversedNumber);
    }

    // 9. Analyze ten integers
    public static void analyzeTenIntegers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int greaterThan50 = 0, lessThan50 = 0, equalTo50 = 0;
        int sumGreater = 0, sumLess = 0, countGreater = 0, countLess = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 50) {
                greaterThan50++;
                sumGreater += numbers[i];
                countGreater++;
            } else if (numbers[i] < 50) {
                lessThan50++;
                sumLess += numbers[i];
                countLess++;
            } else {
                equalTo50++;
            }
        }

        System.out.println("Numbers greater than 50: " + greaterThan50);
        System.out.println("Numbers less than 50: " + lessThan50);
        System.out.println("Numbers equal to 50: " + equalTo50);

        if (countGreater > 0) {
            System.out.println("Average of numbers greater than 50: " + (double) sumGreater / countGreater);
        }

        if (countLess > 0) {
            System.out.println("Average of numbers less than 50: " + (double) sumLess / countLess);
        }
    }

    // 10. Sum of integers up to a given number
    public static void sumOfIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive non-zero integer: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of integers from 1 to " + n + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose a task:");
            System.out.println("1. Greet Name 5 Times");
            System.out.println("2. Miles to Kilometers Table");
            System.out.println("3. Number and Square Table");
            System.out.println("4. Generate Square of *");
            System.out.println("5. Sum of Integers (with option to continue)");
            System.out.println("6. Generate Triangle of *");
            System.out.println("7. Calculate HCF");
            System.out.println("8. Reverse Digits of an Integer");
            System.out.println("9. Analyze Ten Integers");
            System.out.println("10. Sum of Integers Up to a Given Number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    greetName();
                    break;
                case 2:
                    milesToKilometers();
                    break;
                case 3:
                    numberAndSquare();
                    break;
                case 4:
                    generateSquareOfStars();
                    break;
                case 5:
                    sumOfIntegersWithOption();
                    break;
                case 6:
                    generateTriangleOfStars();
                    break;
                case 7:
                    calculateHCF();
                    break;
                case 8:
                    reverseDigits();
                    break;
                case 9:
                    analyzeTenIntegers();
                    break;
                case 10:
                    sumOfIntegers();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
