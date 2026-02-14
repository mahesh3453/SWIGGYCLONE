package com.nit.SwiggyMiniProject;

public class Restaurant {
	private String restaurantName;
	FoodItem [] menu = {
			new FoodItem("Burger",150.0),
			new FoodItem("Pizza",300.0),
			new FoodItem("Fries",175.0),
			new FoodItem("Biryani",199.0),
			new FoodItem("Halwa",110.0),
			new FoodItem("Dosa",75.0),
			new FoodItem("Noodles",105.0),
			new FoodItem("Paratha",35.0),
			new FoodItem("Sushi",80.0),
			new FoodItem("Chiken",250.0)
	};
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	public String getRestaurantName() {
		return restaurantName;
	}


	public void displayFoodItems(FoodItem [] menu) {
		System.out.println("Sr.no       Food Items          Price");
		System.out.println("--------------------------------------");
		for(int i = 0;i<menu.length;i++) {
			System.out.println(i+1+"     |      "+menu[i].itemName+"\t|\t"+menu[i].price);
		}
	}
}
