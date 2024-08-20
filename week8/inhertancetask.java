public class inhertancetask{
    public static void main(String[] args) {


    }
}
class animal{
   public  String name;
   void speak(){
    System.out.println(name);
   }

}
class mammal extends animal{
    public String species;
    void fur(){
    System.out.println(name + species);
    }

}
class reptiles extends animal{
    public String egg;
    System.out.println(egg + scale);
}
class dog extends mammal{
public String breed;
void bark(){
    System.out.println(species + breed);
} 
}
class cat extends mammal{
    public String origin;
    void meow(){
        System.out.println(species + origin);
    } 
}
class amphipions extends reptiles{
    public String scale;
    void swim(){
        System.out.println(scale + egg);
    } 
}
class labrador extends dog{
    public String color;
    void play(){
        System.out.println(breed + color);
    } 

}
class german_sheherd extends dog{
    public String spots;
    void guard(){
        System.out.println(breed + spots);
    } 
}
