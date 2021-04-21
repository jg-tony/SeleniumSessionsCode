package SeleniumSessionsMarch25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By username = By.name("username");
		
		WebElement user_ele = driver.findElement(username);
		user_ele.sendKeys("batchautomation");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		user_ele = driver.findElement(username);
		user_ele.sendKeys("batchautomation");
		

	}

}
