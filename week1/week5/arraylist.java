package week1.week5;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        /* to use array list import from java util likr scanner */
        ArrayList<String> animal=  new ArrayList<>();
        /* instsead of array animal[0]="xyz" we use add finction */
        animal.add("cat");
        animal.add("dog");
        animal.add("monkey");
        System.out.println("the animal is" + animal);
        /* we can add a element directly in index, it  will shift current  index to +1 */
        animal.add(0,"donkey");
        System.out.println("after adding donkey");
        System.out.println(animal);

        //update the actual value
        animal.set(0, "ankitl");

        //access one element from arraylist
        String oneelement= animal.get(0);
        System.out.println("whent eh index is 0" + oneelement);
        System.out.println(animal);

        animal.set(0, "donkey");
        System.out.println(animal);

        /* make a arrayliskt of int
         * with values[100,200,300,400,500]
         * remove 500
         * update 400 to f350 400 to 420
         */
        ArrayList<Integer> lol=new ArrayList<>();
        lol.add(100);
        lol.add(200);
        lol.add(300);
        lol.add(400);
        lol.add(500);
        System.out.println(lol);
        lol.remove(4);
        System.out.println(lol);
        lol.set(2, 350);
        lol.set(3, 420);
        System.out.println(lol);


    



    }
    
}
