package Day01.com.dynamic_online_market_02;

//MarketPlaceMain --> Class to control the execution of code.
public class MarketplaceMain {
    //Main method to control the flow of code.
    public static void main(String[] args) {

        //Creating object of product of different Catagory;
        Product<String> book1 = new Product<>("The life of vinay", 500, "Fiction");
        Product<String> cloth1 = new Product<>("Men's Jacket", 1500, "Men's Clothing");
        Product<String> gadget1 = new Product<>("Smartphone", 20000, "Mobile Gadget");

        //Creating product catalog object and addind product to it.
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book1);
        catalog.addProduct(cloth1);
        catalog.addProduct(gadget1);

        //printing the data of each product in the catalog
        System.out.println("Before applying discount:");
        catalog.showCatalog();

        //Applying discount on each type of product.
        DiscountUtil.applyDiscount(book1, 10);
        DiscountUtil.applyDiscount(cloth1, 20);
        DiscountUtil.applyDiscount(gadget1, 5);

        //printing after the applied discount on the product.
        System.out.println("\nAfter applying discount:");
        catalog.showCatalog();
    }
}
