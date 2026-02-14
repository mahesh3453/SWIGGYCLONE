package com.nit.SwiggyMiniProject;

public class Customer extends User{

	private String address;
	

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

	public boolean validUser() {
		if(getName().isEmpty() || getName().length()<3) {
			return false;
		}
		if(getPhoneNo() < 1000000000L || getPhoneNo() > 9999999999L) {
			return false;
		}
		if(getAddress().isEmpty()) {
			return false;
		}
		return true;
	}

}
