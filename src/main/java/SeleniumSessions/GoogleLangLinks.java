package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLangLinks {
//set vpn to india.
	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		
		driver.get("https://www.google.co.in/");
		
       List<WebElement> langList = 	driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println(langList.size());
		
		for (WebElement e : langList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("తెలుగు")) {
				System.out.println("తెలుగు found");
				e.click();
				break;
			}
		}
		
	}
	
	////*[@id="navFooter"]/div[1]/div/div[1]/ul/li[1]/a
	
	
	
	

}
