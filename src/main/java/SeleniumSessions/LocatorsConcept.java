package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// create the webelement then perform the action (click, sendkeys, gettext, is
		// Dispalyed)
		
		
		// 1 st approach
		// driver.findElement(By.id("input-email")).sendKeys("test_edge@sharklasers.com");
		// driver.findElement(By.id("input-password")).sendKeys("password");
		// driver.findElement(null);

		// 2nd approach
//		WebElement emailId = driver.findElement(By.id("input-email"));
//
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("test_edge@sharklasers.com");
//		password.sendKeys("password");

		// 3rd approach : By locator:
//		By emailId = By.id("input-email");
//		
//		By password = By.id("input-password");
//		
//		driver.findElement(emailId).sendKeys("test_edge@sharklasers.com");
//		driver.findElement(password).sendKeys("password");

		// 4th

//       By emailId = By.id("input-email");
//		
//		By password = By.id("input-password");
//		
//		WebElement email_ele = driver.findElement(emailId);
//		WebElement password_ele = driver.findElement(emailId);
//		
//		email_ele.sendKeys("test_edge@sharklasers.com");
//		password_ele.sendKeys("password");
//		

		// 5th" generic method
//		
//       By emailId = By.id("input-email");
//		
//		By password = By.id("input-password");
//
//		getElement(emailId, "test_edge@sharklasers.com");
//		
//		getElement(password, "password");

		// 6th approach

		By emailId = By.id("input-email");

		By password = By.id("input-password");
		
		By registerLink = By.linkText("Register");

		//doSendKeys(emailId, "test_edge@sharklasers.com");
		//doSendKeys(password, "password");
		
		
		
		
		//2 nd locator: name
		//driver.findElement(By.name("username")).sendKeys("testautomation");

		//3rd : classname : its not a unique element
		//we have to use only when we have a unique class name for that element.
		//driver.findElement(By.className("test")).sendKeys("testing");
		
		//4th : link text : only for links.
		//driver.findElement(By.linkText("Register")).click();
		
		//doClick(registerLink);
		
		//5th partial link text : only for links.
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		//6th: xpath :  is not an attribute 
		//address of the element inside the html DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test_edge@sharklasers.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("password");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		
//		By un = By.xpath("//*[@id=\"input-email\"]");
//		By pwd = By.xpath("//*[@id=\"input-password\"]");
//		
//		doSendKeys(un, "test_edge@sharklasers.com");
		
		
		//7th : css selector:
		driver.findElement(By.cssSelector("#input-email")).sendKeys("test_edge@sharkalsers.com");
		
		//8th : tag name:  special locator
	  		
	}

	// 5th approach method
	public static void getElement(By locator, String value) {
		driver.findElement(locator).sendKeys(value);

	}

	// 6th approach method
	public static WebElement getElement2(By locator) {
		return driver.findElement(locator);
	}

	// 6th approach method
	public static void doSendKeys(By locator, String val) {
		getElement2(locator).sendKeys(val);
	}
	
	public static void doClick(By locator) {
		getElement2(locator).click();
	}
	
	

}
