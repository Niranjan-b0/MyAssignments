package org.programs45;

public class CountOfOdd {

	public static void main(String args[])	{

		int count=0;

		for (int i=1; i<=1000; i++)	{

			if (i%2 == 1)	{

				count = count+1;

			}

		}
		
		System.out.println(count);

	}

}
