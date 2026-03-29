import java.util.List;

public class PancakeHouseIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.size();
    }

    public Object next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
}