package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignments {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[1]")).sendKeys("Jaya Veera Pandiyan B");
		driver.findElement(By.xpath("//input[@value='Chennai']")).clear();
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India, Chennai");

		WebElement verify = driver.findElement(By.xpath("//input[@placeholder='Disabled']"));
		boolean isdisplaying = verify.isDisplayed();
		System.out.println("Text box verification status : "+verify.getAttribute("placeholder")+'\n'+"Is text box disabled : "+isdisplaying);

		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();

		WebElement retrieve = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		System.out.println("Learning status : "+retrieve.getAttribute("value"));

		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[6]")).sendKeys("sampleemail@gmail.com"+"\t");
		driver.findElement(By.xpath("//div[@class='grid formgrid']//textarea")).sendKeys("Sample text for about myself");
		
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank']/p)[1]")).sendKeys("Sample text for text editor");
		
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[9]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000); // For Validation
		WebElement message = driver.findElement(By.xpath("(//div[@role='alert']//span)[2]"));
		System.out.println("Error message is : "+message.getText());

		WebElement label1 = driver.findElement(By.xpath("//label[text()='Username']"));
		org.openqa.selenium.Point before = label1.getLocation();
		System.out.println("Label position before click : "+before);
		driver.findElement(By.xpath("//span[@class='ui-float-label']/input")).click();
		org.openqa.selenium.Point after = label1.getLocation();
		System.out.println("Label position after click : "+after);

		if	(before == after)	{
			System.out.println("Username X,Y label position are equal");
		} else	{
			System.out.println("Username X,Y label position are not equal");
		}

		driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("Jaya Veera Pandiyan");
		Thread.sleep(1000); // For Validation
		driver.findElement(By.xpath("//li[@data-item-label='Jaya Veera Pandiyan2']")).click();
		//Selected 3rd option by index based

		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-k')]")).click();
		WebElement display = driver.findElement(By.xpath("(//div[contains(@class,'ui-widget ui-widget-content ui-corner-all ui')])[2]"));
		boolean status = display.isDisplayed();
		System.out.println("Keyboard appeared : "+ status);

		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank']/p)[2]")).sendKeys("Completed leafground assignment");

		driver.close();
		
	}	

}
