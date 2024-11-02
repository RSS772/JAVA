package javabean;

public class CarMainClass {

	public static void main(String[] args) {
		Car c= new Car();

		c.setBrand("TATA");
		c.setCost(4500000);

		System.out.println("Brand:"+c.getBrand());
		System.out.println("Cost:"+c.getCost());
	}
}
