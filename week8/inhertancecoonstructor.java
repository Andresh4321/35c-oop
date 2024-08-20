
public class inhertancecoonstructor{
public static void main(String[] args){
    halfpant hp=new halfpant();
    hp.differentcolor("red");
    pant pl=new pant();
}
}
class pant{
    String color="white";
    String texture;
    pant(){
        System.out.println("pant default");
    }

    //overlaoding -same function with differnet logic parameter
    pant(String color){
        this.color=color;
        System.out.println("constructor with 2 string param");
    }
    pant(int num){
        System.out.println("num" + num);

    }
    //overloading  can be doen only with difference in param(data type and numebr of param)
    //not variable name,cannot again make pant(string c) 
}
class halfpant extends pant{
    String color;
    halfpant(){
        //if object of child class is made, if automatically excutes
        //super() or pant() int he execution 
        super("green");
        System.out.println("halfpant default contructor");
    }
    void differentcolor(String color){
        System.out.println("parametercolor" + color);
        System.out.println("class color" + this.color);
        System.out.println("parent color" + super.color);
    }
}