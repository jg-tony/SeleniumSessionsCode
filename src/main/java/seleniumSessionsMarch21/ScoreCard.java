package seleniumSessionsMarch21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSessions.BrowserUtil;

public class ScoreCard {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		br.launchUrl("https://www.espncricinfo.com/series/south-africa-women-tour-of-india-2020-21-1253264/india-women-vs-south-africa-women-2nd-t20i-1253273/full-scorecard");
		
//		String xpath = "//a[conatins(text(),'Harleen Deol')]//parent::td//following-sibling::td/span";
//		String text = driver.findElement(By.xpath(xpath)).getText();
//		System.out.println(text);
		
	String text = getWicketTakerName("Jemimah Rodrigues");
	System.out.println(text);
		
	}
	
	public static String getWicketTakerName(String playerName) {
		String xpath = "//a[conatins(text(),'"+playerName+"')]//parent::td//following-sibling::td/span";
		return  driver.findElement(By.xpath(xpath)).getText();
		
	}

}
