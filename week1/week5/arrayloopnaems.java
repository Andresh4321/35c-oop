package week1.week5;
import java.util.ArrayList;
public class arrayloopnaems {
    public static void main(String[] args){
         /* Import arraylist in the top */
ArrayList<String> names =new ArrayList<>();
names.add("Ankit");
names.add("Parvesh");
names.add("Puja");
names.add("Yubraj");
names.add("Manisha");
names.add("Dawa Dai");
names.add("Shreeya");
/*  To get the lenght of arraylist we use .size() function */
int namesLength = names.size();
/* It will return how many element is in the arraylist */
// Use for loop
for(int index = 0; index < namesLength; index++){
System.out.println("Names in index"+names.get(index));
}
System.out.println("using loop");
/* use collection for each */
for(String element: names){
    System.out.println(element);
}
ArrayList<String> aniaml= new ArrayList<>();
aniaml.add("dog");
aniaml.add("cat");
aniaml.add("tiger");
aniaml.add("elephant");
System.out.println(aniaml);
ArrayList<String> wild= new ArrayList<>();
ArrayList<String> domestic= new ArrayList<>();
int animallength=aniaml.size();
for(int index=0;index<animallength;index++){
    String singleelmenet=aniaml.get(index);
    if (singleelmenet=="dog" || singleelmenet=="cat"){
        domestic.add(singleelmenet);
    }
    if (singleelmenet=="tiger" || singleelmenet=="elephant"){
        wild.add(singleelmenet);
    }
}
System.out.println(wild);
System.out.println(domestic);
}
}