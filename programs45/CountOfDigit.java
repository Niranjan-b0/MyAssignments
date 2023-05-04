package org.programs45;

public class CountOfDigit {

	public static void main(String args[])	{

		int a = 123456798, count=0;

		while (a > 0)	{

			a = a / 10;

			count++;

		}

		System.out.println(count);

	}

}