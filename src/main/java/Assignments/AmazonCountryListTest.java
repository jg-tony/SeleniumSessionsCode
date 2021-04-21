package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumSessions.BrowserUtil;
import SeleniumSessions.ElementUtil;

public class AmazonCountryListTest {

	static WebDriver driver;
	static String selectCountry = "Brazil";

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		driver = br.init_driver("chrome");
		driver.get("https://www.amazon.in/");

		By countryElement = By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[4]/ul/li/a");

		ElementUtil el = new ElementUtil(driver);
		
	    List<WebElement> countries = el.getElements(countryElement);
  
	    
	    List<String> countryList = el.getElementsTextList(countryElement);

		System.out.println(countryList.size());

		for (String s : countryList) {
			System.out.println(s);
			
			
		
			}
			
		//to click on country
		System.out.println("clicking on : " + selectCountry);
		  for (WebElement e : countries) {
				
			  String text = e.getText();
			  if(text.equals(selectCountry)) {
				  e.click();
				  break;
			  
			}
				
		
		
		}

//		for (WebElement e : countryList) {
//		  
//			String countries = e.getText();
//			System.out.println(countries);
//		}

	}

}
