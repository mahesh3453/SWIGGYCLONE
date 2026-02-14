package com.nit.SwiggyMiniProject;

import java.util.Random;

public class Order {
	public int qty;
	private String orderId;
	Customer customer = new Customer();
	private Restaurant restaurant;
	
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public void getOrder(int qty) {
		if(qty <= 0) {
			System.out.println("Can not place order with 0 qty");
			return;
		}
		this.qty = qty;
		System.out.println("Your order is under process!!");
	}
	
	public void generateOrderId() {
		Random random = new Random();
		orderId = "SWG"+random.nextLong(4000,9999);
		System.out.println("Order ID : "+orderId);
	}
	
	public void displayOrderDetails(int choice) {
		if(choice <= 0 || choice > 10) {
			System.out.println("Invlid choice!! Food item not found");
			System.exit(0);
		}
		System.out.println("Restaurant Selected: "+restaurant.getRestaurantName());
		System.out.println("Item Added: "+restaurant.menu[choice-1].itemName);
		System.out.println("Total Amount: "+restaurant.menu[choice-1].price*qty);
	}
	
	public void orderStatus() {
		System.out.println("Order Status: PLACED");
		System.out.println("Order Status: PREPARING");
		System.out.println("Order Status: DELIVERED");
		System.out.println("\nThank you for ordering!");
	}
}
