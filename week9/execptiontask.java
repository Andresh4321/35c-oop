public class execptiontask {
    public static void main(String[] args){
          /*  Task
        Find the exception and use try block finally accordingly
        int number1 = 10;
        int number2 = number1 - 10;
        int number3 = number1 / number2;
        String name;
        System.out.println(name.length());
        String[] names = new String[100];
        names[0] = "Ram";
        names[110] = "Ankit";
        */
        try{
            int number1 = 10;
        int number2 = number1 - 10;
        int number3 = number1 / number2;
        }catch(ArithmeticException e){
            System.out.println("useless math");
        }finally{
        System.out.println("times begins  here");
        }
        try{
        String name=null;
        System.out.println(name.length());
    }catch(NullPointerException e){
        System.out.println("u got no name");
    }finally{
        System.out.println("time goes on");
    }

    try{
    String[] names = new String[100];
    names[0] = "Ram";
    names[110] = "Ankit";
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("need more space");
    }finally{
        System.out.println("time ends here");


        //nested exception
        try{
            int number1 = 10;
        int number2 = number1 - 10;
        int number3 = number1 / number2;
        String name=null;
        System.out.println(name.length());
        String[] names = new String[100];
        names[0] = "Ram";
        names[110] = "Ankit";
        }catch(ArithmeticException e){
            System.out.println("useless math");}
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("need more space");
            } catch(NullPointerException e){
                System.out.println("u got no name");
            }finally{
                System.out.println("nested execption");
            }
    }
    }
}