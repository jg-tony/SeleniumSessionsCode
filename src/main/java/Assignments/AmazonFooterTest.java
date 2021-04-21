package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSessions.BrowserUtil;
import SeleniumSessions.ElementUtil;

public class AmazonFooterTest {

	static WebDriver driver;
	static String IND = "https://www.amazon.in/";
	static String USA = "https://www.amazon.com/";

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("firefox");

		driver.get(IND);
          //for amazon.in
		By footerXpath = By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[6]/ul/li");
		
		//for us site
		//By footerXpath = By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[5]/ul/li");

		ElementUtil ele = new ElementUtil(driver);

		List<String> footerList = ele.getElementsTextList(footerXpath);
		
		System.out.println(footerList.size());
		for (String s : footerList) {
			System.out.println(s);
			System.out.println(" ");
		}

		br.quitBrowser();
	}
	
	

}
