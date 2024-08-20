package week7;

public class accessmodifier {
    public static void main(String[] args) {
      accessExample ar=new accessExample();
      ar.name="ram";
      ar.age=10;
      //ar.phone="8979879";  
      ar.printname();
      ar.printthis();
      //
      ar.accessprivate();
    System.out.println(ar.getphone);
    }
    
}
class accessExample{
    String name; //automatically default, meaning package folder access
    public int age;//piblic can be access from anywhere
   private String phone;// private can be accessed only in class
void setphone(String p){
    phone=p;
}
String getphone(){
    return phone;
}
    //same goes to function
    void printthis(){
        System.out.println("printing detials");
    }
    public void printname(){
        System.out.println("name is" + name);
    }
    private void privatefunction(){
        System.out.println("this can be run only inside this class");
    }
    void accessprivate(){
        System.out.println(phone);
        privatefunction();
    }
}
