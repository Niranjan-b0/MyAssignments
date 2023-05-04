package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sampleemail@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement text = driver.findElement(By.linkText("Jaya Veera Pandiyan"));
		System.out.println(text.getText());
		
		driver.findElement(By.linkText("Jaya Veera Pandiyan")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();

		String title = driver.getTitle();
		System.out.println(title);

		Thread.sleep(1000); // For Validation
		driver.findElement(By.className("smallSubmit")).click();

		driver.close();	

	}	

}
