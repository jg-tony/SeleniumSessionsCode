package SeleniumSessionsMarch31;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumSessions.BrowserUtil;

public class CarouselHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		br.launchUrl("https://www.noon.com/uae-en");

		String xpath = "//h3[text()='Recommended For You']/parent::div/../following-sibling::div//div[@data-qa='product-name']";

//		"//h3[text()='" + + "']/parent::div/../following-sibling::div//[contains(@class='Swiper-button-next')]"

		List<WebElement> recommList = driver.findElements(By.xpath(xpath));

		System.out.println(recommList.size());

//		//h3[text()='Recommended For You']/parent::div/../following-sibling::div//[contains(@class='Swiper-button-next')]
//		//h3[text()='Recommended For You']/parent::div/../following-sibling::div//[contains(@class='Swiper-button-next')]

		String next_xpath = "//h3[text()='Recommended For You']/parent::div/../following-sibling::div//div[contains(@class,'swiper-button-next')]";

	//	List<String> dataList = new ArrayList<String>();
		
		Set<String> dataSet = new TreeSet<String>();
		

		while (!driver.findElement(By.xpath(next_xpath)).getAttribute("class").contains("swiper-button-disabled")) {

			for (WebElement e : recommList) {
				String text = e.getText();
				if (!text.isEmpty()) {
					//dataList.add(text);
					dataSet.add(text);
				}
			}
			driver.findElement(By.xpath(next_xpath)).click();
		}
	//	dataList.stream().forEach(e -> System.out.println(e));
		dataSet.stream().forEach(e -> System.out.println(e));

	}

}
