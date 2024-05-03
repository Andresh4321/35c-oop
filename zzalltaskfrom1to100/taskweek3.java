package zzalltaskfrom1to100;
import java.util.Scanner;

public class taskweek3 {
        public static void main(String[] args) {
         //Write a JAVA program to find the maximum between three numbers
         int a=23,b=34,c=35;
         if(a>b && a>c){
         System.out.println("a is greater");  
         }
         else if(b>c && b>a) {
            System.out.println("b is greater");
         } else{
            System.out.println("c is greater");
         }
         //2. Write a JAVA program to check whether a number is negative, positive, or zero.
         int num=0;
         if(num<0){
            System.out.println("num is negative");
         }else if(num>0) {
            System.out.println("positive");
           }  else{
                System.out.println("zero");
            }
         //Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
         int nums=7;
         if(nums%5==0 && nums%11==0){
            System.out.println("divisble");
           }  else{
                System.out.println("not");
            }
           // 4. Write a JAVA program to check whether a number is even or odd.
           int nu=7;
           if(nu%2==0 ){
            System.out.println("even");
           }  else{
                System.out.println("odd");
    
                //5.Write a JAVA program to check whether a year is a leap year or not.
                int leap=8;
                if(leap%4==0 && leap%100!=0 && leap%400==0){
                 System.out.println("leap year");
                }  else{
                     System.out.println("not leap year"); 
                }
               // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant
                Scanner scan=new Scanner(System.in);
                System.out.println("enter the alphabet");
                String number=scan.nextLine();
                if(number!="a" && number!="e" && number!="i" && number!="o" && number!="u"){
                   System.out.println("vowel");
                }else{System.out.println("consenent");}
    
                scan.close();
        }
        /*Some Switch case Statements Questions:
    
    1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.*/
    
    int gpa=3;
    System.out.println("ur gpa is");
    switch(gpa) {
        case 1:
            System.out.println("D");
            break;
        case 2:
            System.out.println("C");
            break;
        case 3:
            System.out.println("B");
            break;
        case 4:
            System.out.println("A");
            break;
        default:
        System.out.println("no gpa");
            break;
    }
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter two numbers:");
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
            if (banana != 0) {
                System.out.println("The result of division is " + (apple / (double) banana));
            } else {
                System.out.println("Cannot divide by zero!");
            }
            break;
        default:
            System.out.println("Invalid operator!");
            break;
    }
    scan1.close();
    /* 
    3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
    */
    Scanner goo=new Scanner(System.in);
    int word=goo.nextInt();
    switch (word) {
        case 1:
        System.out.println("winter");
            
            break;
            case 2:
            System.out.println("summmer");
            break;
            case 3:
            System.out.println("autumn");
            break;
    
            case 4:
            System.out.println("spring");
            break;
        default:
            break;
    }
    goo.close();
    
    /* 
    4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.
    */
    }
    }
    
    
    
    
}
