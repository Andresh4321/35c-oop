package week1.week5;

public class functionclass {
    /* function is created inside class scope not in  main */
    void printsomething(){
        System.out.println("this function just prints ");

    }
    /* void is the return type that\returns nothing 
     * or we donot have to return anything if void is function's return type
    */
    int returnInt(){
    int returnthis=10;
    return returnthis;
    }
    boolean returnboolean(int num1,int num2){
        boolean check=num1==num2;
        return check;

    }

    public static void main(String[] args) {
        /* to use a simple function injava we have to mamke objrct 
         * note: just remember the syntax o fobject for now
        */
        functionclass fc=new functionclass();
        /*call function from fc object */
        fc.printsomething();
        /*can be called again for same actions */
        fc.printsomething();

        int returnfromfuncion=fc.returnInt();
        System.out.println("the function returns" + returnfromfuncion);

        boolean returnfromboolean=fc.returnboolean(10, 20);
        System.out.println("'return boolean value" + returnfromboolean);
    }
}
