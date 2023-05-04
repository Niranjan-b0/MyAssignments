package org.week3.sample;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Jaya Veera Pandiyan B";

		char[] arrayname = name.toCharArray();

		System.out.println(name);

		System.out.println("* Reversed *");

		for (int i=arrayname.length-1; i>=0; i--)	{
			
		System.out.print(arrayname[i]);

		}

	}

}	
