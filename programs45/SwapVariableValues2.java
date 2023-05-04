package org.programs45;

public class SwapVariableValues2 {

	public static void main(String args[])	{

		int a = 10, b = 20;

		a = a + b; // a = 30
		b = a - b; // b = 10
		a = b + b; // a = 20

		System.out.println(a);
		System.out.println(b);

	}

}