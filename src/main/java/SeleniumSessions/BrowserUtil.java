package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class BrowserUtil {

	/**
	 * 
	 */
	WebDriver driver;

	/**
	 * This method is used to initialize the web driver on the basis of given
	 * browserName.
	 * 
	 * @param browserName
	 * @return this method returns the driver
	 */

	public WebDriver init_driver(String browserName) {

		System.out.println("browser name is " + browserName);

		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
			
//		case "edge":
//			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/Drivers/msedgedriver");
//			driver = new EdgeDriver();


		default:
			System.out.println("Please pass the correct browser : " + browserName);
			break;

		}
		return driver;
	}

	/**
	 * 
	 * @param url
	 */
	public void launchUrl(String url) {
		driver.get(url);
	}

	
	
	/**
	 * 
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		 driver.quit();
	}
	
	public String swtichToWindowAndGetTitle(String windowId) {

		driver.switchTo().window(windowId);
		String title = driver.getTitle();
		return title;



	}
	
}
