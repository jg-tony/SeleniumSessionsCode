package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	public static WebDriver driver;

	public static void main(String[] args) {

		//CBSwitchCase("firefox");
		 CBIfElse("chrome");

		driver.get("https://www.google.com");

		String title = driver.getTitle(); // get the title.

		System.out.println("page title: " + title);

		// verification or checkpoint.: actual vs expected
		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title ");
		}

	         quit();

	}

	public static void CBSwitchCase(String browser) {

		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
			driver = new ChromeDriver();
		break;	

		case "firefox":
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("valid browser not selected.");
			break;
		}

	
	}

	public static void CBIfElse(String browser) {

		if (browser.toLowerCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
			 driver = new ChromeDriver();
		} else if (browser.toLowerCase().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver");
		     driver = new FirefoxDriver();
		} else {
			System.out.println("Valid browser not selected.");
			driver = null;
		}

	}
	
	public static void quit() {
		System.out.println("Quitting driver.....");
		driver.quit();
	}

}
