package SeleniumSessionsMarch25;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementMethods {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://amazon.in/");
		By footer = By.cssSelector("ul.footer-nav li a");
		By images = By.tagName("img");
		

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//	    List<WebElement> footerList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footer));//
//		List<WebElement> footerList = waitForVisibilityOfElements(footer, 10);

//		for (WebElement e : footerList) {
//			String text = e.getText();
//			System.out.println(text);
//		}

//		int footerCount = getElementsTextList(footer, 10).size();
//		System.out.println(footerCount);

		//total links and images on thepage.;
	int imagesCount = waitForPresenceOfElements(images, 10).size();
	System.out.println(imagesCount);
		
		
	}

	public static List<WebElement> waitForVisibilityOfElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}

	
	/**
	 * this is method is specifically for tagName
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static List<WebElement> waitForPresenceOfElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}
	
	public static List<String> getElementsTextList(By locator, int timeOut) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = waitForVisibilityOfElements(locator, timeOut);

		for (WebElement e : eleList) {

			if (!e.getText().isEmpty()) {
				eleTextList.add(e.getText());

			}
		}
		return eleTextList;
	}
	
	
	public static WebElement waitForElementToBeClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));

	}
	public static void clickWhenReady(By locator, int timeOut) {
		waitForElementToBeClickable(locator, timeOut).click();
		
	}

}
