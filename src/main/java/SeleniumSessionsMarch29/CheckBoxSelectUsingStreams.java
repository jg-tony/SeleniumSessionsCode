package SeleniumSessionsMarch29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSessions.BrowserUtil;

public class CheckBoxSelectUsingStreams {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		br.launchUrl("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		
		driver.findElements(By.cssSelector("td.select-checkbox")).stream().forEach(ele -> ele.click());
		
		
		
	}

}
