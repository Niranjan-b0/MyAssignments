package org.programs45;

public class PrintAmstrong {

	public static void main(String args[])	{

		for (int i=1; i<=600; i++)	{

			int a=i, b=0, c=0, n=0;

			n=a;

			while (a > 0) {

				b = a % 10;	

				c = c +(b*b*b);	

				a = a / 10;

			} if (n == c)	{
				System.out.println(c);
			}

		}

	}

}