package com;

class CalculatorImpl implements Calculator { //Rule 2

	public void add(int a,int b) {//Rule 3
		int sum = a+b;
		System.out.println("Sum of "+a+" and " +b+" is : "+ sum);
	}
	
	
	public void multiply(int a,int b) {//Rule 3

		System.out.println("Multiplication of "+a+" and " +b+" is : "+ (a*b));
	}


}
