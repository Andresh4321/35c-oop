package zzalltaskfrom1to100;
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    public TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class taskweek9_six {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald");
        NonFictionBook nonFiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook technical = new TechnicalBook("Effective Java", "Joshua Bloch");

        fiction.displayDetails();
        nonFiction.displayDetails();
        technical.displayDetails();
    }
}

