package Day01.com.dynamic_online_market_02;

//Generic method to apply discounts
class DiscountUtil {
    //Method to apply discount on the product
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
    }
}
