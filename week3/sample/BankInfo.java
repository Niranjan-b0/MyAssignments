package org.week3.sample;

public class BankInfo {

	public void saving(int a) {
		System.out.println("Savings amount is : "+a);
	}

	public void fixed(int b) {
		System.out.println("Fixed amount is : "+b);
	}

	public void deposit(int c) {
		System.out.println("Deposited amount is : "+c);
	}

	public static void main(String[] args) {
		
		BankInfo bank = new BankInfo();
		bank.deposit(30000);
		
	}
		
}		
