package org.programs45;

public class CheckAmstrong {

	public static void main(String args[])	{

		int a=407;
		
		int b=0, c=0, n=0;

		n=a;

		while (a > 0) {

			b = a % 10;
			
			c = c +(b*b*b);
			
			a = a/10;

		}

		if (n==c)	{
			System.out.println("Amstrong number");
		} else	{
			System.out.println("Not a Amstrong number");
		}

	}

}		