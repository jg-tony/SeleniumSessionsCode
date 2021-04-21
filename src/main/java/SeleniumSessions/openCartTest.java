package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class openCartTest {
	
	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
	    driver = br.init_driver("chrome");

		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");

		By emailId = By.id("input-email");

		By password = By.id("input-password");

		ElementUtil eleUtil = new ElementUtil(driver);

		eleUtil.doSendKeys(emailId, "test_edge@sharklasers.com");
		eleUtil.doSendKeys(password, "password");

		System.out.println(br.getPageTitle()); // Account Login

	//	br.closeBrowser();

	}
	
	
	
	public static void registerUser() {
		
      driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By enterFirstName = By.id("input-firstname");
		By enterLastName = By.id("input-lastname");
		By enterEmail = By.id("input-email");
		By enterTelephone = By.id("input-telephone");
		By inputPassword = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		By agreePolicy = By.name("agree");
		By clickContinue = By.className("btn btn-primary");
		
		
		ElementUtil ele = new ElementUtil(driver);
		
		ele.doSendKeys(enterFirstName, "Edge12");
		ele.doSendKeys(enterLastName, "TestEdge");
		ele.doSendKeys(enterEmail, "edge12@edge.com");
		ele.doSendKeys(enterTelephone, "1234567890");
		ele.doSendKeys(inputPassword, "testedge");
		ele.doSendKeys(confirmPassword, "testedge");
		ele.getElement(agreePolicy).click();
		ele.getElement(clickContinue).click();
		
		
		
	}
	
	
	
	

}
