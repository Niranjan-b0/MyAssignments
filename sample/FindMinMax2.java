package org.sample;

import java.util.Arrays;

public class FindMinMax2 {

	public static void main(String[] args) {

		int[] nums = {22, 3981, -19, 82, 0, 45, 37};

		Arrays.sort(nums);

		System.out.println("Minimum value: " + nums[0]);

		System.out.println();

		System.out.println("Maximum value: " + nums[nums.length-1]);

	}

}	
