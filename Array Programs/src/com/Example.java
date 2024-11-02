package com;

class Example {
	public static void main(String[] args) {

		int [] a = {10,20,30,40,50,60,70,80,90,100};

		for(int i = 0; i<a.length;i++  ) {
			System.out.println(a[i]);
		}

		System.out.println("---------------------");

		String[] fruits = {"Apple","Mango","Graphs","Oranges"};

		for (int i = 0; i<fruits.length;i++) {
			System.out.println(fruits[i] + " -> "+i);

		}
		System.out.println("Length: "+fruits.length);
	}

}
