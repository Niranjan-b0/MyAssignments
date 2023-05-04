package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
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
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Companies Ltd.");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jaya Veera Pandiyan");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Babu");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jaya Veera");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.name("departmentName")).sendKeys("ABC Department");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.name("description")).sendKeys("Any description");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sampleemail@gmail.com");
		
		WebElement selectstate = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select = new Select(selectstate);
		select.selectByVisibleText("New York");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
			
		driver.close();

	}

}
