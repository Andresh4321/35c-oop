package week1;
import java.util.Scanner;
//or
//import java.util.*: //import all the utils
public class InputOutput {

    public static void main(String[] args) {
        /* print/ output a line with line break
         * use "soul" shortout
        */
        System.out.println("this prints and breaks line");
        /*print the word withou line break*/
        System.out.println("this will not break line");
        System.out.println("this line will continue");

        /*output formating
         * System.out.printf();
         * %s string, %d integral , %f floating point , %b boolean
         * this will not break line too
        */
        System.out.printf("the next word is %s","new word");
        System.out.printf("THE  next int is %d",10);
        /* u can use mutiple formater*/
        System.out.printf("mutiple %f %b",10,9f,false);

        /* user input using Scanner
         * first import the Scanner class
         * import java.util.Scanner: // System.in is used as input
        */
        Scanner scan= new Scanner(System.in); //System.in is used as input
        System.out.println("thr following takes the whole sentence");
        String oneWord=scan.next();
        System.out.println(oneWord);
        System.out.println("the  following takes whole sentence");
        String wholeSentence=scan.nextLine();
        System.out.println(wholeSentence);
        System.out.println("the following takes int");
        int intInput= scan.nextInt();
        System.out.print(intInput);
        System.out.println("the  following takes boolean");
        boolean booleanInput=scan.nextBoolean();
        System.out.println(booleanInput);
        scan.close();

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
    

    }
    
}
