package rtp;

class EmployeeMain {

	static void display(Employee obj) {
		obj.work();
	}

	public static void main(String[] args) {


		//1.Upcasting using method;
		
		display(new Developer());
		
		display(new Tester());

		System.out.println("--------------------");

		//2.Upcasting using single reference;		
		
		Employee emp;
		emp = new Developer(); // Rule -> 3 upcasting
		emp.work();

		emp = new Tester();// Rule -> 3 upcasting
		emp.work();

		System.out.println("--------------------");

		//3.Upcasting Using  seperated reference;
		
		Employee e1 = new Developer();// Rule -> 3 upcasting
		e1.work();
		
		Employee e2 = new Tester();// Rule -> 3 upcasting
		e2.work();


	}
}
