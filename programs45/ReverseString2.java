package org.programs45;

public class ReverseString2 {

	public static void main(String args[])	{

		String name = "welcome";

		System.out.println(name);

		System.out.println("** Reversed **");

		char[] rev = name.toCharArray();

		for (int i=rev.length-1; i>=0; i--)	{

			System.out.print(rev[i]);

		}

	}

}