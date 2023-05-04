package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Jaya Veera Pandiyan");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Babu");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jaya Veera Pandiyan");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Babu");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ABC Department");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("createContactForm_description")).sendKeys("Any description");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sampleemail@gmail.com");
		
		WebElement selectstate = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select = new Select(selectstate);
		select.selectByVisibleText("New York");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("updateContactForm_description")).clear();
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notes");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		Thread.sleep(1000); // For Validation
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	
	}

}
