package week7;

public class Contructorclass {
    public static void main(String[] args) {
        
    
    constructorexample ce=new constructorexample();
    System.out.println("line after object");
    }
}
class constructorexample{
    constructorexample(){
        System.out.println("i run in object creation");
        //continue logic when creating object
    //in most case we use contructor to set attributes 
    }
}
