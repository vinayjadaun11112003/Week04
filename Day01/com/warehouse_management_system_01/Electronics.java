package Day01.com.warehouse_management_system_01;

//Electronics class
public class Electronics extends WarehouseItem {
    private String brand;

    //constructor to set the members of super and current class.
    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    //overriding the display detail method of super class
    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + getName() + " | Price: $" + getPrice() + " | Brand: " + brand);
    }
}
