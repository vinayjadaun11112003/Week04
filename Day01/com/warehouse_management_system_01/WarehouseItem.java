package Day01.com.warehouse_management_system_01;
//Abstract class warehouseitems
public abstract class WarehouseItem {
    private String name;
    private double price;

    //constructor to set the data of the class member
    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //method to get the name of the product
    public String getName() {
        return name;
    }

    //method to get the price of the product
    public double getPrice() {
        return price;
    }

    //abstract method
    public abstract void displayDetails();
}

