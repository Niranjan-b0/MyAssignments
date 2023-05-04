package org.week6.sample;

import org.testng.annotations.Test;

public class AttributesClassRoom {
	
	@Test	(priority = 1)
	public void test1()	{
		System.out.println("Print of test 1 method");
	}
	
	@Test	(enabled = false)
	public void test2()	{
		System.out.println("Print of test 2 method");
	}
	
	@Test	(invocationCount = 2, threadPoolSize = 2, invocationTimeOut = 200)
	public void test3()	{
		System.out.println("Print of test 3 method");
	}
	
	@Test	(dependsOnMethods = {"test3"})
	public void test4()	{
		System.out.println("Print of test 4 method");
	}
	
	@Test	(priority = 2)
	public void test5()	{
		System.out.println("Print of test 5 method");
	}

}		
