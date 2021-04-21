package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.artoftesting.com/sampleSiteForSelenium");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		WebElement doubleClickEle = driver.findElement(By.id("dblClkBtn"));
		Thread.sleep(2000);
		act.doubleClick(doubleClickEle).perform();
		
		
		

	}

}
