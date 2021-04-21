package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// user actins : double click, right click, click, send keys,
		// drag n drop
		// Actions - clas in selenium

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		br.launchUrl("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

		Actions act = new Actions(driver);

		WebElement contentele = driver.findElement(By.className("menulink"));

		act.moveToElement(contentele).perform();
		Thread.sleep(3000);

		driver.findElement(By.linkText("COURSES")).click();

	}

	public static void hoverAndClick(By hoverLocator, By locator) {

		Actions act = new Actions(driver);

		ElementUtil ele = new ElementUtil(driver);
		WebElement contentElement = ele.getElement(hoverLocator); 
		act.moveToElement(contentElement).perform();
		
		ele.doClick(locator);

	}

}
