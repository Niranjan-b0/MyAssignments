package org.programs45;

public class ReverseString1 {

	public static void main(String args[])	{

		String name = "Welcome";

		String rev = "";

		System.out.println(name);

		System.out.println("** Reversed **");

		for (int i=name.length()-1; i>=0; i--)	{

			char ch = name.charAt(i);

			rev = rev + ch;
		}
		System.out.print(rev);
	}

}