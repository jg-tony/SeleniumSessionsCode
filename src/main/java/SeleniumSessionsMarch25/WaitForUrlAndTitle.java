package SeleniumSessionsMarch25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrlAndTitle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

//		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		String title = waitForTitle(5, "Account Login");
//		System.out.println(title);

		
//		driver.get("https://freshworks.com/");
//	System.out.println(waitForTitleContains(5, "customer"));
		
		driver.get("http://automationpractice.com");
	 driver.findElement(By.linkText("Contact us")).click();
	
	if(waitForUrl(5, "controller=contact")) {
		System.out.println("contact for us url is correct");
	}
	
		
	}

	public static String waitForTitle(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();

	}

	public static String waitForTitle(int timeOut, String title, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut, intervalTime);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();

	}

	public static String waitForTitleContains(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();

	}
	
	public static boolean waitForUrl(int timeOut, String url) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(url));
		

	}

}
