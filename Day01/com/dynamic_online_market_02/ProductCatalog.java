package Day01.com.dynamic_online_market_02;
import java.util.*;
//Product Catalog class
class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    //method to add product of any product type
    public void addProduct(Product<?> product) {
        products.add(product);
    }

    //method to showcase data of the product in list.
    public void showCatalog() {
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}
