package com;

import java.util.Scanner;
class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new BankImpl();




		while(true) {

			System.out.println("Welcom to RS Bank!!! ");
			System.out.println("---------------------");
			System.out.println("Enter your choice: ");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			int choic = sc.nextInt();
			switch(choic) {
			case 1:
				System.out.println("Enter Amount to Deposit: ");
				int d = sc.nextInt();
				b.deposit(d);

				break;
			case 2:	
				System.out.println("Enter Amount to Withdraw: ");
				int w = sc.nextInt();
				b.withdraw(w);

				break;

			case 3:
				System.out.println("Check Balance");
				b.checkBalence();
				break;

			case 4:
				System.out.println("Thank You!! Visit Again");
				System.exit(0);

			default:
				System.out.println("Invalid choic.");
			}
			System.out.println("--------------------");
			System.out.println(" ");

		}



	}


}
