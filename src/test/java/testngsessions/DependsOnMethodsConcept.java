package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	
	//dependency bw multiple test cases, is not recommended.
	// test cases should be independent.
	//test case should be written for a specific feature. 
	//test case should have only one or max two assertions. 
	// multiple assertions -- you can have soft assertions.
	// login feature : user name, pwd, login button is displayed or not - 3 soft assertions
	
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i = 9/3;
		
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("Home Test");
	}
	
	@Test(dependsOnMethods = "homeTest")
	public void profileTest() {
		System.out.println("profileTest");
	}
	
	
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	
	
	
	

}
