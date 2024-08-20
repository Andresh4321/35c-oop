package zzalltaskfrom1to100;
interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

public class taskweek10_eight {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1949, true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, false);

        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("Available: " + book1.isAvailable());

        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor());
        System.out.println("Available: " + book2.isAvailable());
    }
}



