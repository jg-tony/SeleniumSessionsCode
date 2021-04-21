package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com"); //parent page
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();   //child page.
		
		Set<String> handles =   driver.getWindowHandles();

		List<String> handlesList = new ArrayList<String>(handles);
		
		 String parentWindowID =handlesList.get(0);
		 String childWindowID =handlesList.get(1);
		 driver.switchTo().window(childWindowID);
		 
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.close();
		 
		 driver.switchTo().window(parentWindowID);
		 System.out.println(driver.getTitle());
		 
		 System.out.println(driver.getCurrentUrl());

		 driver.quit();
		 
		
		
		
	}

}
