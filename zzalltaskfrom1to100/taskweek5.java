package zzalltaskfrom1to100;

public class taskweek5 {
        // 1. Method to check if a number is prime
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    
        // 2. Method to check if a given number n is even
        public static boolean isEven(int n) {
            return n % 2 == 0;
        }
    
        // 3. Method to print the table of a given number n
        public static void printTable(int n) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }
    
        // 4. Method for multiplying 3 numbers and returning the result
        public static int multiplyThreeNumbers(int a, int b, int c) {
            return a * b * c;
        }
    
        // 5. Method for calculating Simple Interest
        public static void calculateSimpleInterest(double principal, double rate, double time) {
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest: " + simpleInterest);
        }
    
        // 6. Method to calculate the area of a rectangle
        public static int calculateArea(int length, int breadth) {
            return length * breadth;
        }
    
        // 7. Method to calculate the factorial of a number
        public static long factorial(int n) {
            if (n == 0 || n == 1) return 1;
            return n * factorial(n - 1);
        }
    
        // 8. Method to calculate the nth Fibonacci number
        public static int fibonacci(int n) {
            if (n <= 1) return n;
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    
        // 9. Method to calculate the GCD of two numbers
        public static int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }
    
        // 10. Method to print all prime numbers less than a given number and count them
        public static void printPrimeLessThan(int n) {
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                    count++;
                }
            }
            System.out.println("Total Prime Numbers less than " + n + ": " + count);
        }
    
        public static void main(String[] args) {
            // Example calls to methods:
    
            // 1. Prime check
            System.out.println("Is 17 Prime? " + isPrime(17));
    
            // 2. Even check
            System.out.println("Is 24 Even? " + isEven(24));
    
            // 3. Print table of a number
            System.out.println("Table of 5:");
            printTable(5);
    
            // 4. Multiply three numbers
            int result = multiplyThreeNumbers(2, 3, 4);
            System.out.println("Multiplication of 2, 3, and 4 is: " + result);
    
            // 5. Calculate Simple Interest
            calculateSimpleInterest(1000, 5, 2);
    
            // 6. Calculate the area of a rectangle
            int area = calculateArea(5, 4);
            System.out.println("Area of rectangle: " + area);
    
            // 7. Factorial of a number
            System.out.println("Factorial of 5 is: " + factorial(5));
    
            // 8. Fibonacci number
            System.out.println("5th Fibonacci number is: " + fibonacci(5));
    
            // 9. GCD of two numbers
            System.out.println("GCD of 48 and 18 is: " + gcd(48, 18));
    
            // 10. Print prime numbers less than a given number
            System.out.println("Prime numbers less than 20:");
            printPrimeLessThan(20);
        }
    }
    

