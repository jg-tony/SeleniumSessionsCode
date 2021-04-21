package SeleniumSessionsMarch24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsInSelenium {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//1.static wait -- Thread.sleep(10);
		// 2. Dynamic wait --> time out is dynamic.
		   //a. Implicitly wait
		   //b. Explicit wait.
		      //b.1 : WebDriverWait.
		      //b.2 : FluentWait.
		               //WebDriverWait extends FluentWait.
		               // both are implementing wait interface. 
		
		//Implicit Wait: 
		   //  is  a global wait.
		   // applied only for web elements, 
		   //not applicable for non web elements : alert, url, title 
		   // driver.findelement/s - by default implicit wait will be applied.
		   // it will be applied after driver initialization.
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username11")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);


		
		
		
		
		
		
		
		
		
		
		
	}

}
