package testngsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumSessions.BrowserUtil;

public class AmazonTestBM {
	

WebDriver driver;
BrowserUtil br = new BrowserUtil();

	@BeforeMethod
	public void setUp() {
		//BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("firefox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		br.launchUrl("https://amazon.com");
		
	}
	
	@Test(priority =1)
	public void amazonPageTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	}
	
	@Test(priority = 3)
	public void amazonLogoTest() {
		
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void searchBarExistTest() {
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());
		
	}
	
	@AfterMethod
	public void tearDown() {
		br.quitBrowser();
	}
	
	
	

}
