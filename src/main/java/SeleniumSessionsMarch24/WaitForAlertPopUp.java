package SeleniumSessionsMarch24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertPopUp {

	static WebDriver driver;

	public static void main(String[] args) {

		// WebDriver wait -- class in Selenium
		// extends fulentWait class. ---> implements wait interface.
		// until method is implemented in fluentwait class.
		// it can be applied for any webelement and non web elements

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();

		// wait for alert:
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();

	}
	
	
	public static Alert waitForAlertPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public String getAlertText(int timeOut) {
		return waitForAlertPresent(timeOut).getText();
	}
	
	public static void acceptAlert(int timeOut) {
		waitForAlertPresent(timeOut).accept();
	}
	
	public static void dismissAlert(int timeOut) {
		waitForAlertPresent(timeOut).dismiss();
	}


}
