package org.week3.sample;

public class CountString2 {

	public static void main(String[] args) {

		String name = "Jaya Veera Pandiyan";

		int count=0;

		for (int i=0; i<name.length(); i++)	{

			if	(name.charAt(i) == 'a')	{
				count++;
			}
		}
		System.out.println(count);
	}
}	
