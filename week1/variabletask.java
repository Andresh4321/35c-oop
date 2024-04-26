package week1;

import java.beans.Expression;

public class variabletask {
    public static void main(String[] args) {
    // task1
    int variable=10, bane=18;
    System.out.println("greater than 18" + (variable >= bane));  
    
    // task2
    int si, t=3, r=2 ,p=20000;
    si=(t*p*r)/100;
    System.out.println(si);

    //tasks 3
    int a, pi,l=10,b=20;
    a=l*b;
    pi=2*(l*b);
    System.out.println("area is" + a);
    System.out.println("perimenter is" + pi); 

    //task 4;
    int output ,number1=20, number3=30;
    output=number3>number1 ? 20 : 10;
    System.err.println(output);
    }

    
}
