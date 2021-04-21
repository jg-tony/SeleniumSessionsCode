package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("firefox");

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);

		By choice = By.cssSelector(".comboTreeItemTitle");

//		List<WebElement> choiceList = driver.findElements(By.cssSelector(".comboTreeItemTitle"));
//
//		for (int i = 0; i < choiceList.size(); i++) {
//			String text = choiceList.get(i).getText();
//
//			if (text.equals("choice 3")) {
//				choiceList.get(i).click();
//				break;
//			}
//		}

		// tc1 : single selection
	//selectChoice(choice, "choice 3");
//		selectChoice(choice, "choice 6 2 1");
//		selectChoice(choice, "choice 7");

		// tc2 : multi selection

	  //  selectChoice(choice, "choice 7", "choice 6 2 2", "choice 6 2 1", "choice 2");
		// 3", "choice 4");

		// tc 3: all selection

		//selectChoice(choice, "selectAll");
	    
	    selectChoice(choice);
	    

	}

	public static void selectChoice(By locator, String... value) {
		
		List<WebElement> choiceList = driver.findElements(locator);

		if (!value[0].equalsIgnoreCase("selectAll")) {

			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();

				// System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}

				}

			}

		} else {

			try {
				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
