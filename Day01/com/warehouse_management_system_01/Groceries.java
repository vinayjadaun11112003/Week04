package Day01.com.warehouse_management_system_01;

//Groceries class
public class Groceries extends WarehouseItem {
    private String expirationDate;

    //constructor to set the members of super and current class.
    public Groceries(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    //overriding method to display the data.
    @Override
    public void displayDetails() {
        System.out.println("Groceries: " + getName() + " | Price: $" + getPrice() + " | Expiry: " + expirationDate);
    }
}

