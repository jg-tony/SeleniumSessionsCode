package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownHandleWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		By indusOptions = By.cssSelector("select#Form_submitForm_Industry option");

		// List<WebElement> list =
		// driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));

		// List<WebElement> list =
		// driver.findElements(By.cssSelector("select#Form_submitForm_Industry
		// option"));

//		for (WebElement e : list) {
//			
//			if(e.getText().equals("Travel")) {
//				e.click();
//				break;
//			}
//			
//		}
//		
		doSelectDropDownValueWithoutSelect(indusOptions, "Travel");

	}

	public static void doSelectDropDownValueWithoutSelect(By locator, String Value) {

		List<WebElement> list = driver.findElements(locator);

		for (WebElement e : list) {

			if (e.getText().equals(Value)) {
				e.click();
				break;
			}

		}

	}

}
