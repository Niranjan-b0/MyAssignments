package org.programs45;

public class CheckNumberPalindrome {

	public static void main(String args[])	{

		int a=121;
		
		int i=0, j=0, n=0;

		n=a;

		while (a > 0)	{

			i = a % 10;

			j = (j * 10) +i;

			a = a / 10;

		}

		if (n == j)	{
			System.out.println("Given number is palindrome");
		}	else	{
			System.out.println("Given number is not palindrome");
		}

	}

}