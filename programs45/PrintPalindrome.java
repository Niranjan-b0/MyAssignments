package org.programs45;

public class PrintPalindrome {

	public static void main(String args[])	{

		for (int i=1; i<=1000; i++)	{

			int a=i, b=0, c=0, n=0;

			n=a;

			while (a > 0)	{

				b = a % 10;

				c = (c * 10) + b;

				a = a / 10;
			}

			if (n == c)	{
				System.out.println(c);
			}


		}

	}

}