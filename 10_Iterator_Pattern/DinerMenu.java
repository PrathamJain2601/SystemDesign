public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Veg Burger", "Veg patty burger", true, 99.0);
        addItem("Chicken Burger", "Chicken patty burger", false, 129.0);
    }

    public void addItem(String name, String desc, boolean veg, double price) {
        if (numberOfItems >= MAX_ITEMS) return;
        menuItems[numberOfItems++] = new MenuItem(name, desc, veg, price);
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}