public class inheritance{
    public static void main(String[] args) {
    
    childclass cc=new childclass();
    cc.lastname="nmv";
    cc.expenses=1000.01;
    cc.firstname="asd";
    cc.info();
    cc.detail();
    cc.salary=10000;//
    }
}

class parentclass{
    public String lastname;
    public int salary;
    protected double expenses;
    void info(){
        System.out.println("parentficntion" + lastname);
    }
} 
//single level inhertance -one parent and one child
//use "extends" to inherit a class
class childclass extends parentclass{
    String firstname;
    void detail(){
        System.out.println("childfunction" + firstname + lastname);
    }
}
//multi level inheritance --nested class
class grandclass extends childclass{
    String middlename;
    void description(){
        System.out.println(firstname + middlename +   lastname);
    }
}

class brotherclass extends parentclass{
    String address;
    void living(){
        System.out.println("address" + address);
    }
}