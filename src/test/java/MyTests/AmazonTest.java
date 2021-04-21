package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	

	
	@Test(priority=1)
	public void amazonTitleTest() {
		driver.get("https://www.amazon.com/");
		Assert.assertTrue(driver.getTitle().contains("Online Shopping"));
	}
	
	
	@Test(priority=2)
	public void amazonLogoTest() {
		Assert.assertTrue(driver.findElement(By.id("nav-logo")).isDisplayed());
				
	}
	
//	
//	@Test(priority=1)
//	public void oragneHRMFreeTrialButtonTest() {
//		Assert.assertTrue(driver.findElement(By.cssSelector(".contact-ohrm")).isDisplayed());
//	}
//	
	


}
