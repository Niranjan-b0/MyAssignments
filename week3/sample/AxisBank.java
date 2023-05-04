package org.week3.sample;

public class AxisBank extends BankInfo	{
	
	public void deposit(int c) {
		System.out.println("Axis bank deposited amount is : "+c);
	}

	public static void main(String[] args) {
		
		AxisBank newinfo = new AxisBank();
		newinfo.saving(10000);
		newinfo.fixed(20000);
		newinfo.deposit(40000);

	}

}		
