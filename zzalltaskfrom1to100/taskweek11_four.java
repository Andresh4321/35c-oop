package zzalltaskfrom1to100;
abstract class MenuItem {
    abstract void prepare();
}

class Appetizer extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing Appetizer...");
    }
}

class MainCourse extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing Main Course...");
    }
}

class Beverage extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing Beverage...");
    }
}

public class taskweek11_four {
    public static void main(String[] args) {
        MenuItem appetizer = new Appetizer();
        MenuItem mainCourse = new MainCourse();
        MenuItem beverage = new Beverage();

        appetizer.prepare();
        mainCourse.prepare();
        beverage.prepare();
    }
}

