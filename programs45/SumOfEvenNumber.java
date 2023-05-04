package org.programs45;

public class SumOfEvenNumber {

	public static void main(String args[])	{

		int count=0;

		for (int i=1; i<=500; i++)	{

			if (i%2 == 0)	{

				count=count+i;


			}

		}

		System.out.println(count);

	}

}