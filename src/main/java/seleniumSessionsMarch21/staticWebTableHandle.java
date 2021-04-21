package seleniumSessionsMarch21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSessions.BrowserUtil;



public class staticWebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		// br.maximizeBrowser();

		br.launchUrl("https://www.w3schools.com/html/html_tables.asp");

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]

		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		

		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		for(int i = 2; i<=rowCount; i++) {
			String xpath = beforeXpath + i +afterXpath;
			//System.out.println(xpath);
			String text = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(text);
		}

	}

}
