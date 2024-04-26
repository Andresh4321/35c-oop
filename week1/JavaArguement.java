package week1;

public class JavaArguement {
    public static void main(String[] args) {
        /* the args in the main function canbe used
         * to take input from command line
         * when executing thr file we can pass arguement
         * eg:
         * java java agemeny args1 args2
         * the arg1 and args 2 can be accessed from args 
        */
        if(args.length<2){
            System.out.println("please provide 2 arguement");
            return;
        }
        /* use use index of args array to access */
        System.out.println("arguement 1 is" + args[0]);
        System.out.println("arguement 2 is" + args[1]);
    }
    
}
