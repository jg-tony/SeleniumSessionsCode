package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act = new Actions(driver);

		act.contextClick(rightClickElement).perform();

		By rightClickOption = By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span");

		selectRightClickOption(rightClickOption, "Paste");
		clickOnAlertPopUP();
		selectRightClickOption(rightClickOption, "Copy");
		clickOnAlertPopUP();

		
		
		

	}

	public static void selectRightClickOption(By locator, String value) {

		List<WebElement> optionsList = driver.findElements(locator);

		for (WebElement e : optionsList) {

			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}
	
	public static void clickOnAlertPopUP() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		alert.accept();   //click on ok button. 
	}

}
