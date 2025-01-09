package com.ATM_project;

import java.util.Scanner;

public class ATM_test {

	static Scanner sc = new Scanner(System.in);
	static boolean status = true;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ac_no:");
		int ac_no=sc.nextInt();
		System.out.println("Enter pin:");
		int pin=sc.nextInt();
		
		

		user user1 = new user("Nagaraju",ac_no,pin);

		System.out.println("welcome to atm services!!!");
		System.out.println("enter your ac_no:");
		long ac_no1 = sc.nextInt();
		if (ac_no1 == user1.getAc_no()) {

			boolean pinstaus = true;
			while (pinstaus) {
				System.out.println("enter your pin:");
				int pin1 = sc.nextInt();

				if (pin1 == user1.getPin()) {

					call_atm_servies(user1);
					pinstaus = false;

				} else {
					System.out.println("invalid pin");
				}

			}
		} else {
			System.out.println("sorry! your account number is not valid");
		}
		System.out.println("thank you visit agian!");

	}

	public static void call_atm_servies(user user1) {

		ATM_interface n = new ATM_services(user1);

		while (status) {

			System.out.println(1 + " for Withdrwal ");
			System.out.println(2 + " for Deposite ");
			System.out.println(3 + " for Balance enquiry");
			System.out.println(4 + " exit");
			System.out.println();
			System.out.println("enter the number you want to perform");
			int n1 = sc.nextInt();
			switch (n1) {

			case 1: {
				n.withdrwal();
				break;
			}
			case 2: {
				n.deopsite();s
				break;
			}
			case 3: {
				n.balence();
				break;
			}
			case 4: {
				status = false;
				return;
			}

			default: {

				System.out.println("enter the valid number");

			}

			}
		
		
		System.out.println("do you want continue ATM services  Yes/No");
		String z = sc.next();
		if (z.equalsIgnoreCase("No")) {
			status = false;

		}

	}

}
}