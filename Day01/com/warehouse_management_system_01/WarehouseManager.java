package Day01.com.warehouse_management_system_01;

import java.util.List;

//WarehouseManager class
public class WarehouseManager {
    //method to display all item data
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}

