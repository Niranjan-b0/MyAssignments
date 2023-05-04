package org.programs45;

public class CheckPalindrome {

	public static void main(String args[])	{

		String name = "malayalam";

		String nm = "";

		for (int i=name.length()-1; i>=0; i--)	{

			char ch = name.charAt(i);

			nm = nm + ch;

		}

		if (nm.equals(name))	{
			System.out.println("Palindrome");
		} else	{
			System.out.println("Not a palindrome");
		}

	}

}	