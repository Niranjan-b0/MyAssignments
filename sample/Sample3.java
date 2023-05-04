package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//String title = driver.getTitle();
		//System.out.println(title);
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement mktId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select list = new Select(mktId);
		list.selectByIndex(1);
		list.selectByValue("CATRQ_CARNDRIVER");
		list.selectByVisibleText("Road and Track");
		
		

		//driver.close();

	}

}	
