package org.week3.sample;

public class Calculator {
	
	public void add(int a, int b, int c)	{
		System.out.println("Sum of 3 int is : "+ (a+b+c));
	}
	
	public void add(int d, int e) {
		System.out.println("Sum of 2 int is : "+ (d+e));
	}
	
	public void add(double f, double g) {
		System.out.println("Sum of 2 double is : "+ (f+g));
	}
	
	public void add(double h, int i) {
		System.out.println("Sum of double and int is : "+ (h+i));
	}
	
	public void add() {
		System.out.println("No args");
	}

	public static void main(String[] args) {
		
		Calculator cals = new Calculator();
		cals.add(10, 10, 10);
		cals.add(20, 20);
		cals.add(30.30, 20.20);
		cals.add(40.40, 10);
		cals.add();
	}

}	
