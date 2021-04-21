package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver");

		WebDriver driver = new ChromeDriver(); //launch browser
		//WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com"); //enter the url
		
	    String title =	driver.getTitle();  //get the title.
	    
	    System.out.println("page title: " + title);
	    
	    
	    //verification or checkpoint.:  actual vs expected
	    if(title.equals("Google")) {
	    	System.out.println("Correct title");
	    }
	    else {
	    	System.out.println("Incorrect title ");
	    }
	    
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    
	    driver.close(); 
	
	    System.out.println(driver.getTitle());
	    //driver.quit();
	  
		
	}

}
