package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(1000); // For Validation
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		
		Thread.sleep(1000); //For Validation
		driver.findElement(By.xpath("//div[@class='grid formgrid']//span[text()='Ajax']")).click();
		
		Thread.sleep(1000); // For Validation
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		Thread.sleep(1000); // For Validation
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		
		Thread.sleep(1000); // For Validation
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		Thread.sleep(1000); // For Validation
		WebElement status = driver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']"));
		System.out.println("Verify if check box is disabled : "+status.getText());
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling :: div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Istanbul']/preceding-sibling :: div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Rome']/preceding-sibling :: div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Brasilia']/preceding-sibling :: div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
		
		Thread.sleep(1000); // For Validation
		driver.close();
		
	}

}
