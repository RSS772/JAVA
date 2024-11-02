package rtp;

class MainFoodDeliveryApp {

	static void display(FoodDeliveryApp obj) {
		obj.orderFood();
	}
	public static void main(String[] args) {
		
		//1.Upcasting using a method.
		display(new Swiggy());
		display(new Zomato());
		
		System.out.println("---------");
		
		//2.Upcasting using single reference variable.
		FoodDeliveryApp f;
		f = new Swiggy();
		f.orderFood();
		
		f = new Zomato();
		f.orderFood();
		
		System.out.println("---------");
		
		//3.Upcasting using separate reference variable.
		FoodDeliveryApp f1 = new Swiggy();
		
		
		f1.orderFood();
		
		FoodDeliveryApp f2 = new Zomato();
		f2.orderFood();
		
		
	}
}
