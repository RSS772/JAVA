package com;

class Tom  implements Person{

	@Override
	public void eat() {
		System.out.println("Eating Food.");

	}

	public static void main(String[] args) {

		System.out.println("Age: "+Person.age);

		Tom t = new Tom();
		t.eat();
	}

}
