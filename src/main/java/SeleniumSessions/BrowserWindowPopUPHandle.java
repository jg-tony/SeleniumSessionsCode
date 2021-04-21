package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUPHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		BrowserUtil br = new BrowserUtil();
		
		driver = br.init_driver("chrome");

		driver.get("https://opensource-demo.orangehrmlive.com"); // parent page

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click(); // child page.

		// window handle API in selenium:
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowID = it.next();
		System.out.println("parentWindowID : " + parentWindowID);

		String childWindowID = it.next();
		System.out.println("childWindowID : " + childWindowID);

	//	driver.switchTo().window(childWindowID);
		
		swtichToWindowAndGetTitle(childWindowID);
		br.closeBrowser();

//		System.out.println("child window title " + driver.getTitle());
//		System.out.println("child window url: " + driver.getCurrentUrl());
//
//		driver.close(); // close the child window -- driver is lost.
//		driver.switchTo().window(parentWindowID);

		
		swtichToWindowAndGetTitle(parentWindowID);
	
//		System.out.println("parent window title : " + driver.getTitle());
//		System.out.println("parent window url : " + driver.getCurrentUrl());
//
//		driver.quit();

	}

	public static String swtichToWindowAndGetTitle(String windowId) {

		driver.switchTo().window(windowId);
		String title = driver.getTitle();
		return title;



	}
}
