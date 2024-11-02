package org;

public class Employee {

	int id;
	String name;
	double salary;

	Employee(int id){
		this.id=id;
	}
	Employee(int id , String name){
		this(id);
		this.name=name;
	}
	Employee(int id , String name , double salary){
		this(id,name);
		this.salary=salary;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(101,"Deku",5022);
		System.out.println("ID:"+emp.id);
		System.out.println("Name:"+emp.name);
		System.out.println("Salary: $"+emp.salary + "LPA");
	}



}
