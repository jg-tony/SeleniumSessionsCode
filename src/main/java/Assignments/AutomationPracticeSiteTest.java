package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeSiteTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

//		driver.findElement(By.id("search_query_top")).sendKeys("dress");
//		Thread.sleep(2000);
//
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='ac_results']/ul/li"));
//
//		for (WebElement e : suggList) {
//			String text = e.getText();
//			System.out.println(text);
//
//			if (text.contains("Faded Short Sleeve T-shirts")) {
//				e.click();
//				break;
//			}
//		}
//
//		WebElement tShirtName = driver.findElement(By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']/h1"));
//
//		String dressName = tShirtName.getText();
//		
//		 if(dressName.equals("Faded Short Sleeve T-shirts")) {
//			 System.out.println("Dress name matches");
//		 }
//		 else {
//			 System.out.println("Dress name does not match.");
//		 }

		
		By searchId = By.id("search_query_top");
		String searchText = "dress";
		By suggListXpath = By.xpath("//div[@class='ac_results']/ul/li");
		String clickOnText = "T-shirts > Faded Short Sleeve T-shirts";
		
		searchAndClick(searchId, searchText, suggListXpath, clickOnText);
		
	}
	
	
	public static void searchAndClick(By locator, String searchKey, By suggListLocator, String clickON) throws InterruptedException {
		
		ElementUtil ele = new ElementUtil(driver);
		
		ele.doSendKeys(locator, searchKey);
		Thread.sleep(2000);
		
		
		List<WebElement> suggList = driver.findElements(suggListLocator);

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals(clickON)) {
				e.click();
				break;
			}
		}
		
		
	}
	
	

}
/**
 * Summer Dresses > Printed Summer Dress Evening Dresses > Printed Dress Summer
 * Dresses > Printed Summer Dress Summer Dresses > Printed Chiffon Dress Casual
 * Dresses > Printed Dress T-shirts > Faded Short Sleeve T-shirts
 */