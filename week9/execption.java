public class execption {
    public static void main(String[] args){
        System.out.println("program start");
        int num1=10;
        try{
            int num2=10/0; //arthimetic execption should exit here

        } catch(ArithmeticException ex){
            //catches the type  of execption provided
            System.out.println("cannot divide by 0");
        }finally{
            System.out.println("runs no matter what");
        }
        int[] arnum=new int[4];
        arnum[0]=10;
        try{
        arnum[100]=300;//arrayindexoutofbonds execption - exists here
    
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("array too small");
        }

          //nullpointer execption
    String data=null;
    try{
    System.out.println(data.length());//nullpointer execption exits here
        }catch(NullPointerException ex){
            System.out.println("nulld data please fill");
        }   

        //nested try block
        try{
            int t1=10/0;
            String d1=null;
            System.out.println(d1.length());
        }catch(ArithmeticException ex){
            System.out.println("number error");
        }catch(NullPointerException ex){
            System.out.println("null ayo");
        }finally{
            System.out.println("try block end");
        }
        //exception
      /*   try{
            String d2=null;
            System.out.println("d2.length()");
        }*/
        System.out.println("program ends here");
    }
  
    
}
