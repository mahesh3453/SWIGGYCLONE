package com.nit.SwiggyMiniProject;

import java.util.Scanner;

public class SwiggyMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Customer customer = new Customer();
		Restaurant restaurant = new Restaurant();
		Order o1 = new Order();
		o1.setRestaurant(restaurant);
		
		//Input from user to set customer details..
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		customer.setName(sc.nextLine());
		System.out.print("Enter Phone Number: ");
		customer.setPhoneNo(Long.parseLong(sc.nextLine()));
		System.out.print("Enter Address: ");
		customer.setAddress(sc.nextLine());
		//validating user details..
		if(!customer.validUser()) {
			System.out.println("\nInvlid user!!!!");
			return;
		}
		System.out.println("\nCustomer validated successfully");
		
		//Restaurant selection
		System.out.println("Select Resturant");
		System.out.println("1] Food Hub\n2] Spice villa");
		System.out.print("Enter your choice: ");
		int choice = Integer.parseInt(sc.nextLine());
		if(choice == 1) {
			restaurant.setRestaurantName("Food Hub");
		}else if(choice == 2) {
			restaurant.setRestaurantName("Spice villa");
		}else {
			System.out.println("Invlid restuarant choice");
			return;
		}
		
		//Food Item Selection
		System.out.println("\nSelect Food Item");
		restaurant.displayFoodItems(restaurant.menu);
		
		System.out.print("Enter your choice[eg.1/2/3]: ");
		int ch = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Quantity[eg.1/2/3]: ");
		int qty = Integer.parseInt(sc.nextLine());
		
		o1.getOrder(qty);
		o1.displayOrderDetails(ch);
		o1.generateOrderId();
		
		//Asking for payment
		System.out.print("\nChoose payment method: ");
		System.out.println("\n1] UPI \n2] Card payment");
		System.out.print("Enter your choice: ");
		int ch1 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter amount : ");
		double amount = Double.parseDouble(sc.nextLine());
		boolean isValidPayment = false;
		if(ch1 == 1) {
			UpiPayment p1 = new UpiPayment();
			if(p1.pay(amount,restaurant.menu[ch-1].price*qty)) {
				isValidPayment = true;
			};
		}else if(ch1==2) {
			CardPayment c1 = new CardPayment();
			if(c1.pay(amount,restaurant.menu[ch-1].price*qty)) {
				isValidPayment = true;
			};
		}else {
			System.out.println("Invlid choice!!!!!");
			System.exit(0);
		}
		
		//Validating payment and displaying order status
		if(isValidPayment) {
			o1.orderStatus();
		}
	}
}
