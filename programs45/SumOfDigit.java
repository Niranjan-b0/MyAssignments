package org.programs45;

public class SumOfDigit {

	public static void main(String args[])	{

		int a = 12344;
		int count = 0;
		int b = 0;

		while (a > 0)	{
			b = a % 10;
			count = count + b;
			a = a / 10;
			
		}
		System.out.println(count);
	}

}