package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsNode {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> scenario1 = driver.getWindowHandles();
		List<String> windowname = new ArrayList<String>(scenario1);
		driver.switchTo().window(windowname.get(1));
		System.out.println("New opened window title is = "+driver.getTitle());
		System.out.println();
		driver.close();
		driver.switchTo().window(windowname.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> scenario2 = driver.getWindowHandles();
		List<String> noOfOpenedTabs = new ArrayList<>(scenario2);
		System.out.println("Number of opened Windows 2nd scenario = "+noOfOpenedTabs.size());
		driver.switchTo().window(noOfOpenedTabs.get(1));
		System.out.println("Window 1 is = "+driver.getTitle());
		driver.close();
		driver.switchTo().window(""+noOfOpenedTabs.get(2));
		System.out.println("Window 2 is = "+driver.getTitle());
		System.out.println();
		driver.close();
		driver.switchTo().window(noOfOpenedTabs.get(0));
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> scenario3 = driver.getWindowHandles();
		List<String> onlyprimary = new ArrayList<>(scenario3);
		System.out.println("Number of opened Windows 3rd scenario = "+onlyprimary.size());
		driver.switchTo().window(onlyprimary.get(3));
		System.out.println("Window 4 is = "+driver.getTitle());
		driver.close();
		driver.switchTo().window(onlyprimary.get(2));
		System.out.println("Window 3 is = "+driver.getTitle());
		driver.close();
		driver.switchTo().window(onlyprimary.get(1));
		System.out.println("Window 2 is = "+driver.getTitle());
		System.out.println();
		driver.close();
		driver.switchTo().window(onlyprimary.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> lastscenario = driver.getWindowHandles();
		List<String> delaywindows = new ArrayList<>(lastscenario);
		System.out.println("Number of opened Windows final scenario = "+delaywindows.size());
		driver.switchTo().window(delaywindows.get(2));
		System.out.println("Window 2 is = "+driver.getTitle());
		driver.switchTo().window(delaywindows.get(1));
		System.out.println("Window 1 is = "+driver.getTitle());
		
		System.out.println();
		System.out.println("Closing all the windows");
		
		driver.quit();
		
	}

}
