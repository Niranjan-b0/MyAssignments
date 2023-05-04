package org.week4.sample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsAndWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println("Windows Count is : "+windowhandles.size());
		
		
		List<String> childwindow = new ArrayList<String>(windowhandles);
		driver.switchTo().window(childwindow.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(childwindow.get(0));
		
		Thread.sleep(2000);
		driver.close();

	}

}	
