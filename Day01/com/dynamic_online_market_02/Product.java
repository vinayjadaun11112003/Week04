package Day01.com.dynamic_online_market_02;


//Generic Product class with bounded type parameter
class Product<T> {
    private String name;
    private double price;
    private String category;

    //Constructor to set the class members
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //method to get name of the product
    public String getName() {
        return name;
    }

    //method to get price of the product
    public double getPrice() {
        return price;
    }

    //method to set price of the product
    public void setPrice(double price) {
        this.price = price;
    }

    //method to get catagory
    public String getCategory() {
        return category;
    }

    //overriding the toString() method to display tha data with object name.
    @Override
    public String toString() {
        return "Product{name='" + name + '\'' + ", price=" + price + ", category=" + category + '}';
    }
}
