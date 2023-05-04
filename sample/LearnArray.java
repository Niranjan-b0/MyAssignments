package org.sample;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {


		String[] names = {"JVP","Thilaga"};

		int name = names.length;

		for (int i=0; i<name; i++) { 
			System.out.println(names[i]); 
		}

		System.out.println();

		int[] numbers = { 9, 0, 4, 2, 6, 3, 1, 0, 8, 0 };

		int nums = numbers.length;

		//****************************************************
		
		for (int i=0; i<nums; i++) { 
			System.out.println(numbers[i]); 
		}
		//****************************************************
		System.out.println("After Sort");

		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length; i++) { // Minimum to Max
			System.out.println(numbers[i]);
		}

		System.out.println("*************************");

		for (int k=numbers.length-1;k>=0;k--)	{	// Max to min
			System.out.println(numbers[k]);
		}

	}

}	
