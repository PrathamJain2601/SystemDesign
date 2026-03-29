import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("Pancake", "Delicious pancake", true, 150.0);
        addItem("Waffle", "Crispy waffle", true, 180.0);
    }

    public void addItem(String name, String desc, boolean veg, double price) {
        menuItems.add(new MenuItem(name, desc, veg, price));
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}