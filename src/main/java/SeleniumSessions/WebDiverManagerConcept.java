package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDiverManagerConcept {
	
	
	public static void main(String[] args) {
		
	
	//WebDriverManager.Chromedriver().setup();
	
	//WebDriverManager.chromedriver().setup();
	
	WebDriverManager.firefoxdriver().setup();
		
	WebDriver driver = new FirefoxDriver();
		
	
	driver.get("http://www.google.com");
	
	
	
	
	
	}

}
