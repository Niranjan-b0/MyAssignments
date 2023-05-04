package org.week4.sample;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrainNames {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		RemoteWebDriver driver = new ChromeDriver(options);

		driver.get("https://erail.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.TAB);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU",Keys.TAB);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();

		 List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr/td[2]/a"));
		
		 for (WebElement trains : trainNames) {
			String text = trains.getText();
			System.out.println(text);
		}
		 
		 //System.out.println();
		 
		// for (int i=2;i<trainNames.size();i++)	{
		//	String text1 = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr["+i+"]/td[2]/a")).getText();
		//	System.out.println(text1);
		// }
		
	}

}
