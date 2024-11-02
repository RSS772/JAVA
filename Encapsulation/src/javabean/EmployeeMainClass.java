package javabean;

import java.util.Scanner;

public class EmployeeMainClass {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);

		Employee e= new Employee();

		System.out.println("Enter Id: ");
		int i = s.nextInt();
		System.out.println("Enter Name: ");
		String n = s.next();
		System.out.println("Enter Salary: ");
		double sal = s.nextDouble();

		e.setId(i); // e.setId(s.nextInt());
		e.setName(n);
		e.setSalary(sal);
		System.out.println("---------------------");
		System.out.println("Id: "+ e.getId());
		System.out.println("Name: "+ e.getName());
		System.out.println("Salary: "+ e.getSalary());

		s.close();
	}
}
