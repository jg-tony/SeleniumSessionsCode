package SeleniumSessionsMarch29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumSessions.BrowserUtil;

public class SeqVsParallelStreams {

	static WebDriver driver;
	
	public static void main(String[] args) {
		

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("firefox");
		
		br.launchUrl("https://www.amazon.in/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		
		//Seq
//		long stTime = System.currentTimeMillis();
//		linksList.stream().filter(ele -> !ele.getText().isEmpty()).forEach(ele -> System.out.println(ele.getText()));
//		long endTime = System.currentTimeMillis();
//		System.out.println("Time taken : "+ (endTime - stTime));
//		
		
		//parallel stream:
		long stTime = System.currentTimeMillis();

		linksList.parallelStream().filter(ele -> !ele.getText().isEmpty()).forEach(ele -> System.out.println(ele.getText()));
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken : "+ (endTime - stTime));


	}

}
