package com.nit.SwiggyMiniProject;

public class UpiPayment implements Payment {

	@Override
	public boolean pay(double paidAmount, double totalAmount) {
		if(paidAmount <= 0 || paidAmount != totalAmount) {
			System.out.println("Payment Failed");
			System.out.println("Error: Payment amount mismatch");
			return false;
		}
		System.out.println("Payment successful using UPI");
		return true;
	}
}
