package SeleniumSessionsMarch24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//WebDriver wait -- class in Selenium
		//extends fulentWait class.  ---> implements wait interface.
		//until method is implemented in fluentwait class.
		// it can be applied for any webelement and non web elements
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//input[@value='Login']");
		By logout = By.xpath("//a[contains(text(),'Logout')]");
		
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		
//		username_ele.sendKeys("groupautomation");
		
		waitForElementPresent(username, 10).sendKeys("groupautomation");
	
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(loginButton).click();
		driver.switchTo().frame("mainpanel");
		waitForElementPresent(logout, 5).click();
		
		
		
		
		
	}

	
	public static WebElement waitForElementPresent(By locator, int timeOut) {
		/**An expectation for checking that an element is present on the DOM of a page. 
		 * This does not necessarily mean that the element is visible.*/
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public static WebElement waitForElementVisible(By locator, int timeOut) {		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
				
	}
	
	
	public static WebElement waitForElementVisibleWithelement(By locator, int timeOut) {		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
