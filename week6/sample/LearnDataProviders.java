package org.week6.sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviders {
	String[][] data;
	
	
	@Test(dataProvider = "sendData")
	public void createLead(String org, String name, String initial) {

		System.out.println("Company name : " + org + "\n" +"Name : " + name + "\n" +"Initial : " + initial);
		

	}
	
	@DataProvider
	public String[][] sendData()	{
		
		data = new String[2][3];
		data[0][0] = "Cts";
		data[0][1] = "JVP";
		data[0][2] = "B";
		
		data[1][0] = "Cognizant";
		data[1][1] = "Jai";
		data[1][2] = "Babu";
		
		return data;
		
	}

}		
