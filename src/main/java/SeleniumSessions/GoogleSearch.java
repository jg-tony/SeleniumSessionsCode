package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("firefox");

		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("software testing");
		Thread.sleep(2000);
		
	List<WebElement> suggList=	 driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='sbl1']//span"));
		
		
		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains("life cycle")) {
				e.click();
				break;
			}
		}
	
		
		
		
		
		
		
	}

}
