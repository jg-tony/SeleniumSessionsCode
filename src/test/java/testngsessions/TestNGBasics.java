package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
    
	
	@BeforeSuite
	public void createUserInDB() {
		System.out.println("Bs - createUserInDB");
	}
	
	
	
	
	@BeforeTest
	public void giveUserPermission() {
		System.out.println("BT - giveUserPermission");
	}
	
	@BeforeClass
	public void launchApp() {
		System.out.println("Bc - open the browser and launch App");
		
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM -- login to app");
	}
	
	
	
	
	@Test
	public void appLogoTest() {
		System.out.println("appLogoTest");
	}
	
	@Test
	public void searchProductTest() {
		System.out.println("searchProductTest");
	}
	
	
	@Test
	public void addToCartTest() {
		System.out.println("addToCartTest");
	}
	
	
	@Test
	public void paymentTest() {
		System.out.println("AT - paymentTest");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM - logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--closeBrowser");
	}
	
	
	@AfterTest
	public void deleteTheUser() {
		System.out.println("AT -- delete the user");
	}
	
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS -- closeDBConnection");
	}
	
	
	

}
