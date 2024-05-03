package zzalltaskfrom1to100;

import java.util.Scanner;

public class week3switchtask {
      public static void main(String[] args) {
        
    Scanner scan1 = new Scanner(System.in);
System.out.println("Enter two numbers: ");
int apple = scan1.nextInt();
int banana = scan1.nextInt();
System.out.println("Enter the operator (+, -, *, /):");
String operator = scan1.next();

switch (operator) {
    case "*":
        System.out.println("The result of multiplication is " + (apple * banana));
        break;
    case "+":
        System.out.println("The result of addition is " + (apple + banana));
        break;
    case "-":
        System.out.println("The result of subtraction is " + (apple - banana));
        break;
    case "/":
       System.out.println("the division is" + apple/banana);
    default:
        System.out.println("Invalid operator!");
        break;
}
scan1.close();
}
    
    
}
