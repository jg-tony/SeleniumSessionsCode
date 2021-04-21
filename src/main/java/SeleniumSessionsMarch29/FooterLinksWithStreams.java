package SeleniumSessionsMarch29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumSessions.BrowserUtil;
import SeleniumSessions.ElementUtil;

public class FooterLinksWithStreams {

static WebDriver driver;
	
	public static void main(String[] args) {
		

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("firefox");
		
		br.launchUrl("https://www.freshworks.com/");
		
		By footerLinks = By.cssSelector("ul.footer-nav a");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.printElementsText(footerLinks, 10);
		
		
		
		
		
	}

}
