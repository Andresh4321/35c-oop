package week1;

public class prefix {
    public static void main(String[] args) {
        /*prefix operator on the left side
        */
        int prefixvalue=10;
        System.out.println("value changes here" + ++prefixvalue);
        System.out.println("prefix remain same" + prefixvalue);

        /* postfix operator on the  right side */
        int postfixvalue=20;
        System.out.println("postfix value doesnot change here" + postfixvalue);
        System.out.println("it changes in next line" + postfixvalue);
    }
    
}
