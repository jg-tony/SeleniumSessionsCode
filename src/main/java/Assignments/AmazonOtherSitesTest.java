package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumSessions.BrowserUtil;
import SeleniumSessions.ElementUtil;

public class AmazonOtherSitesTest {

	static WebDriver driver;
	static String IND = "https://www.amazon.in/";
	static String USA = "https://www.amazon.com/";

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("firefox");

		driver.get(USA);

		//amazon.in
		//By links = By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[5]/table[1]/tbody/tr/td/a");

		//amazon.com
		By links = By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[4]/table/tbody/tr/td/a");
		
		ElementUtil ele = new ElementUtil(driver);

		List<String> list = ele.getElementsTextList(links);
		System.out.println(list.size());

		for (String s : list) {
			System.out.println(s);
			System.out.println(" ");

		}

		// to click on

//		List<WebElement> linksList = ele.getElements(links);
//
//		System.out.println("No of links : " + linksList.size());
//
//		for (WebElement e : linksList) {
//			System.out.println(e.getText());
//
//			if (e.getText().contains("Prime Now")) {
//				System.out.println("Found Prime Now and clicking on it");
//				e.click();
//			}
//
////			if (e.getText().equals("Prime Now\n" + "2-Hour Delivery\n" + "on Everyday Items")) {
////				System.out.println("Found Prime Now and clicking on it");
////				e.click();
////			}
//		}

//		br.quitBrowser();
	}
}
