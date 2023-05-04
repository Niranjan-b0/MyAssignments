package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> fromcontactwidget = driver.getWindowHandles();
		System.out.println("From contact windows Count = "+fromcontactwidget.size());
		List<String> fromcontact = new ArrayList<String>(fromcontactwidget);
		driver.switchTo().window(fromcontact.get(1));
		driver.findElement(By.xpath("//a[text()='10997']")).click();
		driver.switchTo().window(fromcontact.get(0));

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> tocontactwidget = driver.getWindowHandles();
		System.out.println("To contact windows Count = "+tocontactwidget.size());
		List<String> tocontact = new ArrayList<String>(tocontactwidget);
		driver.switchTo().window(tocontact.get(1));
		driver.findElement(By.xpath("//a[text()='11001']")).click();
		driver.switchTo().window(fromcontact.get(0));

		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("The final page title is = "+driver.getTitle());
		
		driver.close();

	}

}
