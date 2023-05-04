package org.sample;

public class Palindrome {

	public static void main(String[] args) {

		String name = "malayalam";

		char[] arrayname = name.toCharArray();

		System.out.println(name);

		System.out.println("* Reversed *");

		for (int i=arrayname.length-1; i>=0; i--)	{

			System.out.print(arrayname[i]);

		}

	}

}
