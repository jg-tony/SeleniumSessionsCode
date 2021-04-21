package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SeleniumSessions.BrowserUtil;
import SeleniumSessions.ElementUtil;

public class AmazonOtherTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("firefox");
		driver.get("https://www.amazon.com");
		ElementUtil ele = new ElementUtil(driver);

		By compListele = By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[1]/div[1]/div");
		List<String> compList = ele.getElementsTextList(compListele);
		System.out.println(compList.size());
		
		for (String b : compList) {
			System.out.println(b);
			System.out.println();
		}

		
		By listNameEle = By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[1]/div[1]/div/div");
		
	
		List<String> textList = ele.getElementsTextList(listNameEle);
		System.out.println(textList.size());
		for (String s : textList) {
			System.out.println(s);
			System.out.println();
		}
		
		
		
		By getToKnowUsele = By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[1]/div[1]/div[1]/ul/li");
		
		List<String> getToKnowUsList= ele.getElementsTextList(getToKnowUsele);
		System.out.println(getToKnowUsList.size());
		for (String a : getToKnowUsList) {
			System.out.println(a);
			System.out.println();
		}
		
		
	br.quitBrowser();
	}

}
