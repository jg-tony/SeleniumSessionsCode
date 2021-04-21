package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoCartTest extends BaseTest {


	

	
	@Test(priority=2)
	public void demoCartTitleTest() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}
	
	
	@Test(priority=3)
	public void demoCartUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("opencart"));
	}
	
	
	@Test(priority=1)
	public void demoCartButtonTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector(".contact-ohrm")).isDisplayed());
	}
	
	

}
