package Day01.com.warehouse_management_system_01;

import java.util.ArrayList;
import java.util.List;
//Storage Generic class
public class Storage<T extends WarehouseItem> {
    private List<T> items;

    //constructor to initialize the arraylist
    public Storage() {
        this.items = new ArrayList<>();
    }

    //method to add items
    public void addItem(T item) {
        items.add(item);
    }

    //method to remove items
    public void removeItem(T item) {
        items.remove(item);
    }

    //method to get list of the items
    public List<T> getItems() {
        return items;
    }

    //method to display the items of list.
    public void displayItems() {
        for (T item : items) {
            item.displayDetails();
        }
    }
}

