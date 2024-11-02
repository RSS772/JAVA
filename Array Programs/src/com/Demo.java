package com;

public class Demo {

	public static void main(String[] args) {

		// Array Declaration
		int[] a ;

		// Array Creation
		a = new int[3];

		// Printing Array Elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("Length: " + a.length);

		System.out.println("------------");

		//Array Initialization

		a[0]=45;
		a[2]=99;


		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("------------");
		//Array Declaration and Creation

		double[] x = new double[2];

		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println("Length: " + x.length);

		System.out.println("------------");

		x[1] = 20.36;
		x[0] = 00.78;

		System.out.println(x[0]);
		System.out.println(x[1]);




	}
}
