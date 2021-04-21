package SeleniumSessionsMarch29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamsPractice {

	public static void main(String[] args) {

		// Streams in JDK 8
		// functional interface
		// launch amazon app
		// get all the links text
		// no blanks text

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		driver.get("https://www.amazon.in");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		List<String> amazonLinksList = linksList.stream().filter(ele -> !ele.getText().isEmpty())
										.filter(ele -> ele.getText().contains("Amazon"))
											.map(ele -> ele.getText()).collect(Collectors.toList());

		amazonLinksList.stream().forEach(e -> System.out.println(e));

		
		List<String>  namesList = new ArrayList<String>();
		namesList.add("Tom IBM");
		namesList.add("Peter CTS");
		namesList.add("Lisa IBM");
		namesList.add("Steve Infosys");
		namesList.add("Naveen abc");
		namesList.add("amita IBM");
		
		namesList.stream().filter(ele -> ele.contains("IBM")).forEach(e-> System.out.println(e));

		
		
		
		
	}

}
