package week1;

public class istatement {
        public static void main(String[] args) {
            /* simple if statement takes  condition . expression qith boolean expression*/
            if(true){
                System.out.println("true statement");
            }
            if(false){
                System.out.println("skipppde statement");
            }
            else{
            System.out.println("false statemnt");
                }
            
        
        /*if codition falls, goes to else block/scope */
        int num1=10,num2=20;
        if(num1>num2){
            System.out.println("num1 is greater");
        }else{
            System.out.println("nm2 is  greater");
        }
        /* if else if */
        int inum1=10,inum2=10;
        if(inum1==inum2){
            System.out.println("equal number");
        }else if(inum1<num2){
            System.out.println("inum2 is grater");
    
        }else{
            System.out.println("num1 is greater");
        }
        /* note that else should be at last of the if statement */
        /*if esle if ladder,more that one else if */
        if(inum1<0)
    { System.out.println("inum2 is negative ");} 
    else if(inum2<0){
        System.out.println("num2 is negative");
    }   else if(inum1==inum2){
        System.out.println("equal number");
    }else{
        System.out.println("default execution if all fails");
    }
    /*note that else is not mandatory and can be skipped */
    /*nested if statement*/
    int nnum1=-10,nnum2= 20;
    if(nnum1<0){
        if(nnum1>nnum2){
         System.out.println("nnum1 is greatwe and negative");
         }else{
            System.out.println("nnum2 is greater and postive");
        }
    }   else{
        if(num1>num2){
            System.out.println("num1 is postive and greater ");
        }else{
            System.out.println("nnum1 is positive and lesser");
        }

    }
    }
}
