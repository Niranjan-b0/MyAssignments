package org.week4.sample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsAndFrames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement clicktry = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(clicktry);
		driver.findElement(By.xpath("//body/button")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement clickresult = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println("Try it click result : "+clickresult.getText());
		
		//driver.close();
	}

}
