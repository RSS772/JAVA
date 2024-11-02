package com;

public class MobileMainClass {
	
	public static void main(String[] args) {

		Mobile m = new Mobile();
		System.out.println("Brand:"+ m.brand );
		System.out.println("Cost:" + m.cost);
		m.call();
	}
}
