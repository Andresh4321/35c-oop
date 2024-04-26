package week1;
import java.util.Scanner;
public class InputOutputasks {
    public static void main(String[] args) {
          /*task
         *crate a new scanner obj name scan1
         prompt user for following information what is ur name? -> save to string name,use nextline()
         are you over 18 -> save to boolean status, nextboolean()
         how many sibling do you have? ->save int sibling, use nextint()
         print the output
         hello,name
         over 18 status,
         you have -- number of siblings 
        */
        Scanner scan1= new Scanner(System.in);
        System.out.println("who are you");
        String name=scan1.nextLine();
        System.out.println("Are you over 18?");
        boolean status=scan1.nextBoolean();
        System.out.println("how many sibling do u have?");
        int sibling=scan1.nextInt();
        System.out.println("hello" + name);
        System.out.println("over 18" + status);
        System.out.println("number of sibling" + sibling);
        scan1.close();
        
        
    }
    
}
