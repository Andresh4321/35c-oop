package week7;

public class firsttoop {
    public static void main(String[] args) {
     Person p1=new Person();
     p1.name="ram";
     p1.age=18;
     p1.gender='M';
     p1.introduction();

     Person p2=new Person();
     p2.name="shram";
     p2.age=28;
     p2.gender='M';
     p2.introduction();
     
     Person p3=new Person();
     p3.name="andresh";
     p3.age=18;
     p3.gender='M';
     p3.introduction();

     square s1= new square();
     s1.sides=10;
     int s1area=s1.area();
     System.out.println(s1area);
     System.out.println(s1.area());
     s1.increasesidex(2);
     System.out.println(s1.area());

  rectangle w1=new rectangle();
     w1.l=3;
     w1.b=4;
     System.out.println(w1.areaa());

     perimeter q1=new perimeter();
     q1.l=10;
     q1.b=10;
     System.out.println(q1.per());

     car i1=new car();
     i1.name="bmw";
     i1.brand="ntot";
     i1.year=1918;
     i1.display();
    }
    
}

class car{
    String name;
    String brand;
    int year;
    void display(){
        System.out.println("the name of car" + name);
        System.out.println("the brand of car" + brand);
        System.out.println("the year of car" + year);
    }
}
class square{
    int sides;
    int area(){
        return sides * sides;
    }
    void increasesidex(int val){
        sides=sides + val;
    }
}
class rectangle{
    double l,b;
    double areaa(){
        return l * b;
    }
}
class perimeter{
    int l,b;
    int per(){
        return 2*(l * b);
    }
    void info(){
        System.out.println("length" + l + "breadth" + b);
    }
}
class Person{
    String name;
    int age;
    char gender;

    void introduction(){
        System.out.println("my naem is" + name);

    }
}
/*task creat a class rectangle
 * create 2 attribute,length and  breadth as double
 * make a function that returns area of rectangle
 * make a function taht returns perimeter of rectangle
 * make a function inof, that prints the lengthand breadth of the rectangle
 * make an object of rectangle
 * fill both the attribute/fields
 * call the area and perimeter and print them
 * call the function info
*/


/* task create class car
 * cfrate attribute name,brand,year
 * crate a function expiry taht returns years added iwth 100
 * create a function staert prints name is staring
 * create a function stop print brand is stooping
 * create a function info print (name,brand,year)
 * crate 2 object
 * fill attribute of both
 * start both object
 * stop 1st objet
 * info of 2 nd obejct
*/