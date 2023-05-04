package org.week3.sample;

public class SplitTheString {

	public static void main(String[] args) {

		String name = "Jaya Veera Pandiyan";

		String[] split = name.split(" ");// u can split frm any char or special chars by giving inside "".

		for (int i=0; i<=split.length-1; i++)	{
			System.out.println(split[i]);
		}

		System.out.println();
		
		for (int j=split.length-1; j>=0; j--)	{
			System.out.println(split[j]);
		}

	}

}	
