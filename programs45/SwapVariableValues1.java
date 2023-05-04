package org.programs45;

public class SwapVariableValues1 {

	public static void main(String args[])	{

		int a = 10, b = 20;
		int temp = a; // Assignes "a" value to "temp"

		a = b; // Assigning "b" value to "a"
		b = temp; // Assigning "temp" value to "b"

		System.out.println(a);
		System.out.println(b);

	}

}	