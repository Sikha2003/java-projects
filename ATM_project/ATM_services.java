package com.ATM_project;

import java.util.Scanner;

public class ATM_services implements ATM_interface {

	private user user1;

	public  ATM_services(user u) {
		user1 = u;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void withdrwal() {
		System.out.println("Enter withdraw amount:");
		double amount = sc.nextDouble();
		if (user1.getBalance() < amount) {
			System.out.println("sorry!" + user1.getUser_name() + " you have insufficiant funds " + user1.getBalance());
			System.out.println("your cuurent balence is:" +user1.getBalance() + "");

		} else {
			user1.setBalance(user1.getBalance() - amount);

			System.out.println("your amount:" + amount + "is sucessfuly withdraw");

			System.out.println("your current balence :" + user1.getBalance());

		}

	}

	@Override
	public void deopsite() {
		System.out.println("Enter deposit amount:");
		double amount1 = sc.nextDouble();
		if (amount1 > 0) {
			user1.setBalance(user1.getBalance() + amount1);
			System.out.println("your deposit " + amount1 + " sucessfully deposit");
			System.out.println("your current balence:"+user1.getBalance());

		}

	}

	@Override
	public void balence() {

		System.out.println("your current balence :" + user1.getBalance());
	}

}
