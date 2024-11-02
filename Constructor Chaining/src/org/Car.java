package org;

public class Car {

	String brand;
	int cost;

	Car(){
		System.out.println("Hii");
	}

	Car(String brand ){
		this();
		this.brand=brand;
	}

	Car(String brand , int cost ){
		this(brand);
		this.cost=cost;
	}


	public static void main(String[] args) {

		Car c = new Car("Suzuki",50000);
		System.out.println("Brand:" + c.brand);
		System.out.println("Cost:" + c.cost);
	}
}
