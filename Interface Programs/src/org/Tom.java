package org;

public class Tom extends Employee implements Jspider,Qspiders {

	@Override
	public void testApp() {
		System.out.println("Test App");

	}

	@Override
	public void developApp() {
		System.out.println("Develop App");
	}

	@Override
	public void work() {
		System.out.println("Working ");


	}

	public static void main(String[] args) {

		Tom t = new Tom();
		t.work();
		t.developApp();
		t.testApp();
		t.walk();

	}


}
