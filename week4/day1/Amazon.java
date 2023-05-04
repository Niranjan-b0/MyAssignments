package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement mobileTotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String mobilePrice = mobileTotal.getText();
		System.out.println("Mobile price is = "+mobilePrice);
		
		WebElement noOfCustomerRating = driver.findElement(By.xpath("(//span[text()='(1)'])[1]"));
		String rating = noOfCustomerRating.getText();
		System.out.println("Total customer rated = "+rating);
		
		driver.findElement(By.xpath("//span[contains(text(),'(Renewed) OnePlus 9 Pro 5G (Morning Mist, 12')]")).click();
		Set<String> onepluswindow = driver.getWindowHandles();
		List<String> oneplus = new ArrayList<String>(onepluswindow);
		driver.switchTo().window(oneplus.get(1));
		
		File screenprint = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenprint, new File("D:\\Sample\\Amazonscreenshot.jpg"));
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		WebElement cartTotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String cartPrice = cartTotal.getText();
		System.out.println("Cart price is = "+cartPrice);
		
		if	(mobilePrice.equals(cartPrice) )	{
			System.out.println("Mobile and Cart price are same");
		} else	{
			System.out.println("Mobile and Cart price are not same");
		}
		
		driver.quit();
		
	}		

}
