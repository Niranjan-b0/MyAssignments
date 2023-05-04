package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//div[@class='card']//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[1]")).click();
		
		Thread.sleep(1000); // For Validation
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		Thread.sleep(1000); // For Validation
		WebElement status = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		System.out.println("Default browser selected : "+status.getText());
		
		Thread.sleep(1000); // For Validation
		WebElement age = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		System.out.println("Default age group selected : "+age.getText());
		
		Thread.sleep(1000); // For Validation
		driver.close();
		
		
	}

}
