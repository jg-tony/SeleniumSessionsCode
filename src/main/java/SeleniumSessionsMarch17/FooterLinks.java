package SeleniumSessionsMarch17;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumSessions.BrowserUtil;

public class FooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		br.launchUrl("https://freshworks.com");
		
//		List<WebElement> footerList = driver.findElements(By.xpath("//ul[@class='footer-nav']/li/a"));
//		
//		System.out.println(footerList.size());
//		
//		for (WebElement e : footerList) {
//			System.out.println(e.getText());
//			
//		}
		
		
		int colCount =  driver.findElements(By.xpath("(//ul[@class='footer-nav'])")).size();
		List<String> colValueList = new ArrayList<String>();
		
		for(int i=1; i<=colCount; i++) {
			
			List<WebElement> colList = driver.findElements(By.xpath("(//ul[@class='footer-nav'])["+i+"]/li/a"));
			for (WebElement e : colList) {
				colValueList.add(e.getText());
				
			}
		}
		System.out.println(colValueList);
		
		
		
		
	}

}
