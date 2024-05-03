package week1;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        /*while loop takes condition inside */
        int count=0;
        while(count<=5){
            System.out.println("while count" + count);
            count ++;
        }
        /* real use of hwile is used whennumber ofiteratiom is not fixed
         * for eg, if you want to keep asking a user for input  until the desired condition
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter the number");
        int intvalue=scan.nextInt();
        while(intvalue<0 || intvalue >100){
            System.out.println("the number between 0-100");
            intvalue=scan.nextInt();
    }
    System.out.println("correct condiaition" + intvalue);
    scan.close();
    }
    
}
