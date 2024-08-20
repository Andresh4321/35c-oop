package week7;

public class example {
    // Task 
// Make a class Dog
// make 2 private attribute, name and breed
// make 1 public attribute, age
// make setter for name and breed
// make getter for name and breed
// Make 1 object of Dog
// fill all the attribute
// print the following from object
// Name: xyz
// Breed: abc
// Age: 10 
public static void main(String[] args) {
    dog ar=new dog();
    ar.name="ram";
    ar.breed="german";
    ar.age=10;
    //ar.phone="8979879";  
    ar.rintthis();
    ar.printit();
}
}
class dog{
    private String name,breed;
    public int age;
    private void rintthis(){
        System.out.println(name);
        System.out.println(breed);
        privatefunction();
    
    }
    public void printit(){
        System.out.println(age);
    }
}
