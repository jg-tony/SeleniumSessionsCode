package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestReigster {

	
	static String firstName = "Edge";
	static String lastName = "testEdge";
	static String emailId = "edge@edge.com";
	static String telephone = "123456790";
	static String password = "testedge";
	
	
	
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.init_driver("chrome");
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By enterFirstName = By.id("input-firstname");
		By enterLastName = By.id("input-lastname");
		By enterEmail = By.id("input-email");
		By enterTelephone = By.id("input-telephone");
		By inputPassword = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By newsletterNo = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]");
		By agreePolicy = By.name("agree");
		
		ElementUtil ele = new ElementUtil(driver);
		
		ele.doSendKeys(enterFirstName, firstName);
		ele.doSendKeys(enterLastName, lastName);
		ele.doSendKeys(enterEmail, emailId);
		ele.doSendKeys(enterTelephone, telephone);
		ele.doSendKeys(inputPassword, password);
		ele.doSendKeys(confirmPassword, password);
		ele.getElement(newsletterNo).click();
		ele.getElement(agreePolicy).click();
		
		System.out.println(br.getPageTitle());
		
		

		
	}

}
