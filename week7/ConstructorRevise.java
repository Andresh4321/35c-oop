package week7;

public class ConstructorRevise {
    public static void main(String[] args){
        NonParameterizedConstructor np = new NonParameterizedConstructor();
        System.out.println("After object");
        System.out.println(np.salary);
        System.out.println(np.age);
        // System.out.println(np.name);
        ParameterizedConstructor pc = new ParameterizedConstructor("Ram", 100, 18);
        System.out.println(pc.salary);
        System.out.println(pc.age);
        System.out.println(pc.getName());
        pc.setName("Shyam");
        System.out.println(pc.getName());

        Song song1 = new Song("Nai na bhannu la", 100);
        song1.setId(1);
        song1.setArtists("DJ Khaled");
        song1.album = "DJ Shreeya";
        song1.description = "Shreeya sachikai DJ";
        song1.setDuration(10);
        System.out.println("Song " + song1.getId());
        System.out.println("Title " + song1.getTitle());
        System.out.println("Duration " + song1.getDuration());
        System.out.println("Arthist " + song1.getArtists());
        System.out.println("Album " + song1.album);
        System.out.println("Description " + song1.description);
    }
}
// Task 
// Make a class Song
// make 4 private property: id, title, duration and artists
// make 2 public property: album and description
// make constructor to set title and duration only
// make setter for id, duration and artists
// make getter for id, title, duration and artists
// make 2 object of Song
// Fill all the attributes
// Change the duration of 1st object
// Change the artists of 2nd object
// Print the following for both object
// Output
// Song 1
// Title: ABC
// Duration: 10
// Artists: XYZ
// Album: XX
// Description: Lorem Ipsum
// Song 2
// ..
class Song{
    private String title, artists;
    private int id, duration;
    public String album, description;
    Song(String title, int duration){
        this.title = title;
        this.duration = duration;
    }
    void setId(int id){
        
this.id
 = id;
    }
    void setDuration(int duration){
        this.duration = duration;
    }
    void setArtists(String artists){
        this.artists = artists;
    }
    String getTitle(){
        return this.title;
    }
    String getArtists(){
        return this.artists;
    }
    int getId(){
        return 
this.id
;
    }
    int getDuration(){
        return this.duration;
    }
}
class ParameterizedConstructor{
    private String name; // 
    this.name;

    public int salary;
    int age;
    void setName(String name){
        
this.name
 = name;
    }
    String getName(){
        return 
this.name
;
    }

    ParameterizedConstructor(String name, int salary, int age){
        
this.name
 = name;
        this.salary = salary;
        this.age = age;
    }
}

class NonParameterizedConstructor{
    private String name;
    public int salary;
    int age;

    NonParameterizedConstructor(){
        name = "Unkown";
        salary = 10;
        age = 18;
        System.out.println("I run in object creation");
    }
} 
    

