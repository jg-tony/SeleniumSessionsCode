package SeleniumSessionsMarch25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://freshworks.com");

		List<WebElement> compList = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a"));

		for (int i = 0; i < compList.size(); i++) {
			System.out.println(compList.get(i).getText());
			compList.get(i).click();
			compList = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[2]//a"));

		}
	}

	
	
	
	
	
}
