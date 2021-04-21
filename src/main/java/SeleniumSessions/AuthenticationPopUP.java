package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUP {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokupp.com/basic_auth");  //in this method, password should not have '@' in it.
		
		
		//CDP  - API - 2nd method.
		
		
	}

}
