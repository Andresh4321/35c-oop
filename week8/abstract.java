public class abstract{
    public static void main(string[] args){
    
    }
//to make abstract class 'abstract' keyword used before "class"
//abstract class cannot be made object of
abstract class smartphone{
    //abstract class may or maynot contain abstract function
    //abstract function do not have body (function hiding)
    abstract void sms();
    abstract String call(int number);
    //can contain normal function
    //normal function should contain body
    void imei(){
        System.out.println("imikw");
    }
}
//abstract class need to be extended in child class
class samsung extends smartphone{
    //all the abstract function of abstract class needs to be implemented/overridden
    @Override
    void sms(){
        System.out.println("samsung way of sms");
    }
    @Override
    String call(int number){
        return number + " is calling";
    }
}
}