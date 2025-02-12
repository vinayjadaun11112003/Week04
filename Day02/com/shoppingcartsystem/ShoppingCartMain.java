package com.shoppingcartsystem;

// Main class to test the ShoppingCart system.

public class ShoppingCartMain {
	public static void main(String[] args) {
		// Creating an instance of ShoppingCart to manage the cart
		ShoppingCart cart = new ShoppingCart();

		// Adding products to the cart
		cart.addProduct("Apple", 10);
		cart.addProduct("Banana", 45);
		cart.addProduct("Orange", 20);
		cart.addProduct("Apple", 25); // Adding more Apple
		cart.addProduct("Mango", 30);

		// Displaying products in the order they were added to the cart
		cart.displayProductsInOrder();

		// Displaying products sorted by their prices
		cart.displayProductsSortedByPrice();

		// Displaying the total price of all products in the cart
		cart.displayTotalPrice();
	}
}
