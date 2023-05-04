package org.week3.sample;

public class LearningStringMethods {

	public static void main(String[] args) {
		
		String name = "Jaya Veera Pandiyan";

		String lower = name.toLowerCase();
		System.out.println(lower);
		
		String upper = name.toUpperCase();
		System.out.println(upper);
		
		String replace = "31080 Jaya Veern";
		System.out.println(replace.replace("n","a"));
		
		String chars = replace.replaceAll("\\d", "");
		System.out.println(chars);
		
		String nums = replace.replaceAll("\\D", "");
		System.out.println(nums);
		
		int parseInt = Integer.parseInt(nums);
		System.out.println(parseInt+20);
		
		String nums1 = replace.replaceAll("[0-9]","");
		System.out.println(nums1);
		
		String chars1 = replace.replaceAll("[^0-9]","");
		System.out.println(chars1);
		
		String novowels = name.replaceAll("[aeiouAEIOU]", "");
		System.out.println(novowels);
		
		String frm = name.substring(11);
		System.out.println(frm);
		
		String between = name.substring(0,10);
		System.out.println(between);
	}

}	
