package com.ATM_project;

public class user {

	private String user_name;
	private long ac_no;
	private int pin;
	private double balance = 0;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public long getAc_no() {
		return ac_no;
	}

	public void setAc_no(long ac_no) {
		this.ac_no = ac_no;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//no arg constructor
	public user(String name, int ac_no, int pin) {
		super();
		this.user_name=name;
		this.ac_no=ac_no;
		this.pin=pin;

	}

	public String String() {
		return "user [user_name= '+name+', ac_no= '+ac_no+',pin= '+pin+',balence= '+balence+']";

	}


}
