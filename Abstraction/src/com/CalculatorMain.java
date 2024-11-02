package com;

import java.util.Scanner;
class CalculatorMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value for sumation");
		System.out.println("Enter the 1st value :");
		int a = sc.nextInt();
		System.out.println("Enter the 2st value :");
		int b = sc.nextInt();

		System.out.println("-----------------");
		
		System.out.println("Enter the value for multiplication");
		System.out.println("Enter the 1st value :");
		int x = sc.nextInt();
		System.out.println("Enter the 2st value :");
		int y = sc.nextInt();
		
		Calculator calc = new CalculatorImpl(); // Rule 4 -> Upcasting
		
		calc.add(a,b);
		calc.multiply(x,y);
		
		sc.close();

	}
}
