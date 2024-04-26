package week1;
import java.util.Scanner;

public class week3task {
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
}
}
