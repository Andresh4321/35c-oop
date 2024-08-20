public class inhertamtask {
        /*
 * Make a class Shirt
 * Make 2 attribute color and thread
 * Make a parameterized constructor that takes color and thread
 * Make a non parameterized constructor that sets default \
 * color to "White" and texture to "Cotton"
 * Make a class Polo that extends Shirt
 * Make 1 attribute color , set default to Green
 * Make non parameterized constuctor on Polo \
 * call the parameterized constructor of Parent with "Red" and "Silk"
 * Make a function design() in Polo that takes String color \
 * set the current color of Polo to Shirt
 * set the parameter color to current color or Polo
 * Make a function detail() that prints parent color and thread
 * also print the color of current Polo
 * Make an object of polo and call function design and detail
 */ 
    public static void main(String[] args) {
        Polo polo = new Polo();
        polo.design("Blue");
        polo.detail();
    }
}

class Shirt {
    String color;
    String thread;

    // Parameterized constructor
    Shirt(String color, String thread) {
        this.color = color;
        this.thread = thread;
    }

    // Non-parameterized constructor
    Shirt() {
        this.color = "White";
        this.thread = "Cotton";
    }
}

class Polo extends Shirt {
    String color = "Green"; // Attribute specific to Polo

    // Non-parameterized constructor
    Polo() {
        super("Red", "Silk");
    }

    // Method to change design
    void design(String color) {
        super.color = this.color;
        this.color = color;
    }

    // Method to print details
    void detail() {
        System.out.println("Parent color: " + super.color);
        System.out.println("Thread: " + super.thread);
        System.out.println("Polo color: " + this.color);
    }
}