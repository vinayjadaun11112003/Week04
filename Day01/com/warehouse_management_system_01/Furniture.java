package Day01.com.warehouse_management_system_01;

//Furniture class
public class Furniture extends WarehouseItem {
    private String material;

    //constructor to set the members of super and current class.
    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    //overriding the display detail method of super class
    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + getName() + " | Price: $" + getPrice() + " | Material: " + material);
    }
}

