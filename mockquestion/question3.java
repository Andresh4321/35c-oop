package mockquestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class question3 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(1, "Carol");
        cart.addItem("Book", 10);
        cart.addItem("Pen", 2);
        cart.calculateTotal();
        cart.removeItem("Pen");
        cart.calculateTotal();
    }
}
/* question 3 */
class ShoppingCart {
    private int cartId;
    private String customerName;
    private List<Item> items;
    public ShoppingCart(int cartId, String customerName) {
        this.cartId = cartId;
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }
    public void addItem(String item, double price) {
        items.add(new Item(item, price));
        System.out.println("Added " + item + " for " + price + ". Total items: " + items.size());
    }

    public void removeItem(String item) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item currentItem = iterator.next();
            if (currentItem.getName().equals(item)) {
                iterator.remove();
                System.out.println("Removed " + item + ". Total items: " + items.size());
                return;
            }
        }
        System.out.println("Item " + item + " not found in the cart.");
    }
    public void calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        System.out.println("Total cost: " + total);
    }
    private class Item {
        private String name;
        private double price;
        public Item(String name, double price) {
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
}
