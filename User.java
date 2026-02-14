package com.nit.SwiggyMiniProject;

public class User {
	private String name;
	private long phoneNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(long phoneNo) {
		if(phoneNo < 1000000000L || phoneNo > 9999999999L) {
			System.out.println("Invalid phone no!!");
			return;
		}
		this.phoneNo = phoneNo;
	}
	
	
}
