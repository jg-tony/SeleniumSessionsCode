package SeleniumSessionsMarch23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

	//	driver.get("https://classic.crmpro.com/index.html");
		driver.get("https://www.amazon.in/");

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);

		SeleniumSessions.JavaScriptUtil jsUtil = new SeleniumSessions.JavaScriptUtil(driver);
		System.out.println(jsUtil.getTitleByJS());

		// jsUtil.refresbrowserByJS();
		// jsUtil.generateAlert("this is my JS ALert");
		// System.out.println(jsUtil.getPageInnerText()); 
		// jsUtil.scrollPageDown();

		//System.out.println(jsUtil.getPageInnerText());
		
//		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));	
//		WebElement login_form = driver.findElement(By.id("loginForm"));
//		jsUtil.drawBorder(login);
//		jsUtil.drawBorder(login_form);
		
//		jsUtil.flash(login_form);
		
//		jsUtil.clickElementByJS(login);
		
		jsUtil.scrollPageDown();
		Thread.sleep(2000);
		jsUtil.scrollPageUp();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Up to 50% off | Nutritional supplements']"));
		jsUtil.scrollIntoView(ele);
		
		
		
		
		

	}

}
