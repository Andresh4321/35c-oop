package week4;
import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        int num1=0;
        /*while checks the condition first */
        while(num1<0){
            System.out.println("this will not print since since condition is false");
        }
        /*do while checks the condition after the loop
         *  meaning,do while loop runs at least once even if condition is false
        */
        do {
            System.out.println("do while will check condition after the statement");
        }
        while(num1<0);
         
    /* use  while lopp to ask a user for a integer
     * keep asking user for number unless the integer is negative
     */
    Scanner scan=new    Scanner(System.in);
    System.out.println("enter the num");
    int num=scan.nextInt();
    while(num>=0){
        System.out.println("enter the num");
    num=scan.nextInt();
    }
    System.out.println("the condition meet" + num);

    scan.close();
    }
    
}
