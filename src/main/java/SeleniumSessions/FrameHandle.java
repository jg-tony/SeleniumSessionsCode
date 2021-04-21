package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		br.launchUrl("http:/www.londonfreelance.org/courses/frames/index.html");
		
		
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));

		
		WebElement header = driver.findElement(By.xpath("/html/body/h2"));
		
		System.out.println(header.getText());
		
		driver.switchTo().defaultContent(); 
		
		driver.switchTo().parentFrame();

		
		
		
	}

}
