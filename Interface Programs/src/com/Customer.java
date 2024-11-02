package com;

class Customer  implements Flipkart{

	public void buy(String product) {
		System.out.println("Buy Product: " + product);

	}

	public void pay(int amount) {
		System.out.println("Paying: $" + amount);
	}

	
	public static void main(String[] args) {

		Customer c = new Customer();

		c.buy("Watch");
		c.pay(35000);
	}
}
