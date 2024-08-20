package week7;

public class tasksss{
    public static void main(String[] args) {
        // Creating 2 objects of Song
        Song song1 = new Song("ABC", 10);
        Song song2 = new Song("DEF", 20);

        // Setting additional attributes
        song1.setId(1);
        song1.setArtists("XYZ");
        song1.album = "XX";
        song1.description = "Lorem Ipsum";

        song2.setId(2);
        song2.setArtists("PQR");
        song2.album = "YY";
        song2.description = "Dolor Sit Amet";

        // Changing duration of 1st object
        song1.setDuration(15);

        // Changing the artists of 2nd object
        song2.setArtists("LMN");

        // Printing details of both songs
        System.out.println("Song 1");
        System.out.println("Title: " + song1.getTitle());
        System.out.println("Duration: " + song1.getDuration());
        System.out.println("Artists: " + song1.getArtists());
        System.out.println("Album: " + song1.album);
        System.out.println("Description: " + song1.description);

        System.out.println("\nSong 2");
        System.out.println("Title: " + song2.getTitle());
        System.out.println("Duration: " + song2.getDuration());
        System.out.println("Artists: " + song2.getArtists());
        System.out.println("Album: " + song2.album);
        System.out.println("Description: " + song2.description);
    }
}

class Song {
    // Private properties
    private int id;
    private String title;
    private int duration;
    private String artists;

    // Public properties
    public String album;
    public String description;

    // Constructor to set title and duration only
    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getArtists() {
        return artists;
    }
}
