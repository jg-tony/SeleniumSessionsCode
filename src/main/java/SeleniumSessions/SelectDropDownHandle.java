package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		// drop down having : select - tag name
		// select class from selenium

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");

//		Select sel_industry = new Select(driver.findElement(industry));
//		
//		//sel_industry.selectByIndex(5);
//		sel_industry.selectByVisibleText("Automotive");
//		
//		//sel_industry.selectByValue("health");
//		
//		Select sel_country = new Select(driver.findElement(country));
//		sel_country.selectByVisibleText("India");

//		doSelectDropDownValueByIndex(country, 5);
//		doSelectDropDownValueByIndex(industry, 4);

		doSelectDropDownValueByVisibleText(country, "India");
		doSelectDropDownValueByValue(industry, "media");
		

				
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownValueByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public static void doSelectDropDownValueByVisibleText(By locator, String visibletext) {

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibletext);

	}

	public static void doSelectDropDownValueByValue(By locator, String value) {

		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

}
