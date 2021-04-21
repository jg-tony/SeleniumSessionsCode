package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSendKeysAndClickConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By emailId = By.id("input-email");

		By password = By.id("input-password");
		By loginButton = By.xpath("//input[@type='submit']");

//		WebElement emailEle = driver.findElement(emailId);
//
//		WebElement passwordEle = driver.findElement(password);
//		WebElement loginEle = driver.findElement(loginButton);
//
//		Actions act = new Actions(driver);
//		act.sendKeys(emailEle, "test_edge@sharklasers.com").perform();
//		act.sendKeys(passwordEle, "password").perform();
//		act.click(loginEle).perform();

		doActionsSendKeys(emailId, "test_edge@sharklasers.com");
		doActionsSendKeys(password, "password");
		doActionsClick(loginButton);
		
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, String value) {

		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();

	}

	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).click().perform();
	}

}
