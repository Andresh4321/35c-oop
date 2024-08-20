

public class interfaceclass {
public static void main(String[] args) {
    System.out.println("arm");
    
}
    
}
//making interface is similar to class,replace class with "interface'
//interface is automatically abstract
interface animaldo{
    public void move();
    public boolean eat(String food);
    //function of an interface is automativally abstractand public
}
//interface can extend interface with new functions 
interface mammaldo extends animaldo{
    public int legs();
} 
//can be nested in mutiple interface
interface dogdo extends mammaldo{
    public void barks();
}
interface domesticanimaldo{
    public void pet();
}
//class can implement,use "interface functions mus beoverriden"
class husky implements dogdo,domesticanimaldo{
    //when implementingnested interface all function on top of interface needs to be overriden
    @Override
    public void pet(){
        System.out.println(" husky is being pet");
}
    @Override
    public void barks(){
        System.out.println("bow wow");
}
@Override
public int legs(){
    return 4;
}
@Override
public boolean eat(String food){
    return true;
}
@Override
public void move(){
    System.out.println("husky moves");
}
}
 //we cannot make object of interface
 //interface is implementer in class using "implemetns"
 class wolf implements animaldo{
    //when implementing interface, all the  function should be overriden
    @Override
        public void move(){
            System.out.println("wolf walks fast");
        }
    


    @Override
    public boolean eat(String food){
        System.out.println("wolf eat meat");
        return true;
    }
}
class cow implements animaldo{
    @Override
    public void move(){
        System.out.println("cow walks slowy");
    }
    @Override
    public boolean eat(String food){
        System.out.println("cat eats grass");
        return true;
}
}
