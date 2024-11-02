package com;

public class Student {
	
	String name;
	int marks;

	Student(String name, int marks){
		this.marks=marks;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Ritik", 98);
		System.out.println("Name: "+s1.name+" "+ "Marks: "+s1.marks);
		Student s2 = new Student("Ram", 97);
		System.out.println("Name: "+s2.name+" "+ "Marks: "+s2.marks);

	}
}
