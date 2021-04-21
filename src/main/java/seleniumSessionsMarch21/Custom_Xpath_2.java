package seleniumSessionsMarch21;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSessions.BrowserUtil;

public class Custom_Xpath_2 {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		br.launchUrl("https://classic.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		/*
		 * //a[text()='Devisha
		 * Sharma']/parent::td/preceding-sibling::td/input[@type='checkbox'] --- to
		 * click on checkbox left to name.
		 * 
		 * //a[text()='Devisha Sharma']/parent::td/following-sibling::td/a
		 * 
		 */
		selectContact("Devisha Sharma");
		// selectContact("priyanka jadhav");
		System.out.println(getCompName("Devisha Sharma"));

	}

	public static void selectContact(String name) {

		String xpath = "//a[text()='" + name + "']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();

	}

	public static String getCompName(String name) {

		String xpath = "//a[text()='" + name + "']/parent::td/following-sibling::td/a";
		return driver.findElement(By.xpath(xpath)).getText();

	}

	public static String getPhoneNumber(String name) {

		String xpath = "//a[text()='" + name + "']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();

	}

	/*
	 * input name return : the list of all the information right side : phone,
	 * emial, comp etc. ,
	 */
	public static List<String> getContactsInfo(String name) {
		List<String> contactInfoList = new ArrayList<String>();

		String compName = getCompName(name);
		String ph = getPhoneNumber(name);
		
		contactInfoList.add(compName);
		contactInfoList.add(ph);
		
		return contactInfoList;

	}

}
