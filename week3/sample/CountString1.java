package org.week3.sample;

public class CountString1 {

	public static void main(String[] args) {

		String name = "Jaya Veera Pandiyan";

		int count = 0;

		char[] charname = name.toCharArray();

		for	(int i=0; i<=charname.length-1; i++){
			//System.out.print(charname[i]);

			if (charname[i] == 'a')	{
				count ++;
			}
		}

		System.out.println(count);

	}

}
