package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws Exception  {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jaya");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.name("lastname")).sendKeys("Veera");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.name("reg_email__")).sendKeys("9042631080");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");

		WebElement bday = driver.findElement(By.name("birthday_day"));
		Select list1 = new Select(bday);
		Thread.sleep(1000); // For Validation
		list1.selectByValue("8");

		WebElement month = driver.findElement(By.id("month"));
		Select list2 = new Select(month);
		Thread.sleep(1000); // For Validation
		list2.selectByVisibleText("Sep");

		WebElement year = driver.findElement(By.id("year"));
		Select list3 = new Select(year);
		Thread.sleep(1000); // For Validation
		list3.selectByValue("1992");

		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[@value='1']")).click();

		//String title = driver.getTitle();
		//System.out.println(title);
		//Thread.sleep(2000); // For Validation
		
		Thread.sleep(1000); // For Validation
		driver.close();

	}

}
