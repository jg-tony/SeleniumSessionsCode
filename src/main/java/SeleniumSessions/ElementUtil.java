package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String val) {
		getElement(locator).sendKeys(val);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doActionsSendKeys(By locator, String value) {

		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();

	}

	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).click();
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	public List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();

		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			if (!e.getText().isEmpty()) {

				eleTextList.add(e.getText());

			}
		}

		return eleTextList;
	}

	public String switchToWindowAndGetTitle(String windowId) {
		driver.switchTo().window(windowId);
		String title = driver.getTitle();

		return title;
	}

	public List<String> getElementAttributeList(By locator, String attributeName) {
		List<String> attributeList = new ArrayList<String>();
		List<WebElement> elementList = getElements(locator);

		for (WebElement e : elementList) {
			attributeList.add(e.getAttribute(attributeName));
		}

		return attributeList;

	}

	public void doActionsMoveToElement(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}

	/******************************************
	 * Drop down utils
	 *******************************/

	public void doSelectDropDownValueByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public void doSelectDropDownValueByVisibleText(By locator, String visibletext) {

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibletext);

	}

	public void doSelectDropDownValueByValue(By locator, String value) {

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);

	}

	public void doSelectDropDownValue(By locator, String value) {
		Select sel_indus = new Select(getElement(locator));

		List<WebElement> optionsList = sel_indus.getOptions();

		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			// System.out.println(e.getText());
			String text = e.getText();

			if (text.equals(value)) {
				e.click();
				break;
			}

		}
	}

	public void doSelectDropDownValueWithoutSelect(By locator, String Value) {

		List<WebElement> list = getElements(locator);

		for (WebElement e : list) {

			if (e.getText().equals(Value)) {
				e.click();
				break;
			}

		}

	}

	// **************************Wait
	// UTILS*******************************************************//

	public WebElement waitForElementPresent(By locator, int timeOut) {
		/**
		 * An expectation for checking that an element is present on the DOM of a page.
		 * This does not necessarily mean that the element is visible.
		 */
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public WebElement waitForElementVisibleWithelement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}

	public Alert waitForAlertPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public String getAlertText(int timeOut) {
		return waitForAlertPresent(timeOut).getText();
	}

	public void acceptAlert(int timeOut) {
		waitForAlertPresent(timeOut).accept();
	}

	public void dismissAlert(int timeOut) {
		waitForAlertPresent(timeOut).dismiss();
	}

	public String waitForTitle(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();

	}

	public String waitForTitle(int timeOut, String title, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut, intervalTime);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();

	}

	public String waitForTitleContains(int timeOut, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();

	}

	public boolean waitForUrl(int timeOut, String url) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.urlContains(url));

	}

	public void waitForFrameAndSwitchToIt(String idOrName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));

	}

	public void waitForFrameAndSwitchToIt(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));

	}

	public void waitForFrameAndSwitchToIt(int index, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));

	}

	public void waitForFrameAndSwitchToIt(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));

	}

	public List<WebElement> waitForVisibilityOfElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}
	
	public void printElementsText(By locator, int timeOut) {		
		waitForVisibilityOfElements(locator, timeOut)
			.stream()
				.forEach(ele -> System.out.println(ele.getText()));
	}
	
	public void printListElements(List<String> eleList) {
		eleList.forEach(ele -> System.out.println(ele));
	}
	
	public List<String> getElementsListWithText(By locator, int timeOut, String filterVal) {
		return waitForVisibilityOfElements(locator, timeOut)
			.stream()
				.filter(ele -> ele.getText().contains(filterVal))
					.map(ele -> ele.getText())
						.collect(Collectors.toList());
	}
	
	public List<WebElement> getElementsList(By locator, int timeOut, String filterVal) {
		return waitForVisibilityOfElements(locator, timeOut)
			.stream()
				.filter(ele -> ele.getText().contains(filterVal))
						.collect(Collectors.toList());
	}

	/**
	 * this is method is specifically for tagName
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public List<WebElement> waitForPresenceOfElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}


	
	
	public List<String> getElementsTextList(By locator, int timeOut) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = waitForVisibilityOfElements(locator, timeOut);

		for (WebElement e : eleList) {

			if (!e.getText().isEmpty()) {
				eleTextList.add(e.getText());

			}
		}
		return eleTextList;
	}

	/*
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 */
	public WebElement waitForElementToBeClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));

	}

	public void clickWhenReady(By locator, int timeOut) {
		waitForElementToBeClickable(locator, timeOut).click();

	}

	public WebElement waitForElementWithFluentWait(By locator, int timeOut, long pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofMillis(pollingTime)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public Alert waitForAlertWithFluentWait(int timeOut, long pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofMillis(pollingTime)).ignoring(NoAlertPresentException.class);

		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public WebDriver waitForFrameWithFluentWait(String frameLocator, By locator, int timeOut, long pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofMillis(pollingTime)).ignoring(NoSuchElementException.class)
				.ignoring(NoSuchFrameException.class);

		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));

	}

}
