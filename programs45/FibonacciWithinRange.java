package org.programs45;

public class FibonacciWithinRange {

	public static void main(String args[])	{

		int a = 0, b = 1, c = 0;

		for (int i=1; i<=10; i++)	{

			c = a + b;

			if (a <= 10)	{	

				System.out.print(a+" ");

				a = b;
				b = c;

			}

		}

	}

}