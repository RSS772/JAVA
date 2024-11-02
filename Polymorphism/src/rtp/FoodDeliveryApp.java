package rtp;

public class FoodDeliveryApp {
	
	void orderFood() {
		System.out.println("Food is Ordered!.");
	}
}

class Swiggy extends FoodDeliveryApp{
	@Override
	void orderFood() {
		System.out.println("Dosa is ordered from Swiggy");
	}
}

class Zomato extends FoodDeliveryApp{
	@Override
	void orderFood() {
		System.out.println("Ordering Burger from Zomato");
	}
}
