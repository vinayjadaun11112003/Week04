package Day01.com.warehouse_management_system_01;
//WareHouseManagerMain class --> Class to control the execution of code.
public class WareHouseManagerMain {
    //Main method to control the flow of code.
        public static void main(String[] args) {
            //Creating storage objects for different item types
            Storage<Electronics> electronicsStorage = new Storage<>();
            Storage<Groceries> groceriesStorage = new Storage<>();
            Storage<Furniture> furnitureStorage = new Storage<>();

            //Adding items to respective storages
            electronicsStorage.addItem(new Electronics("Laptop", 1200.50, "Dell"));
            electronicsStorage.addItem(new Electronics("Smartphone", 699.99, "Samsung"));

            groceriesStorage.addItem(new Groceries("Milk", 3.49, "2025-02-20"));
            groceriesStorage.addItem(new Groceries("Bread", 2.99, "2025-02-15"));

            furnitureStorage.addItem(new Furniture("Sofa", 899.99, "Leather"));
            furnitureStorage.addItem(new Furniture("Dining Table", 499.99, "Wood"));

            //Displaying items using wildcard method
            System.out.println("===== Electronics Storage =====");
            WarehouseManager.displayAllItems(electronicsStorage.getItems());

            System.out.println("\n===== Groceries Storage =====");
            WarehouseManager.displayAllItems(groceriesStorage.getItems());

            System.out.println("\n===== Furniture Storage =====");
            WarehouseManager.displayAllItems(furnitureStorage.getItems());
        }
    }


