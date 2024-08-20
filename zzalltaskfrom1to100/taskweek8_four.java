package zzalltaskfrom1to100;
import java.util.ArrayList;
import java.util.List;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
        System.out.println(item.getName() + " added to the menu.");
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        System.out.println(item.getName() + " removed from the menu.");
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
    }
}

public class taskweek8_four {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem item1 = new MenuItem("Burger", 5.99);
        MenuItem item2 = new MenuItem("Pizza", 8.99);

        menu.addItem(item1);
        menu.addItem(item2);
        menu.displayMenu();

        menu.removeItem(item1);
        menu.displayMenu();
    }
}


