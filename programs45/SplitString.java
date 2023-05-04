package org.programs45;

public class SplitString {

	public static void main(String args[])	{

		String statement = "Hi Hello Welcome";

		String[] words = statement.split(" ");

		for (String splitted : words)	{

			System.out.println(splitted);
		}

	}

}