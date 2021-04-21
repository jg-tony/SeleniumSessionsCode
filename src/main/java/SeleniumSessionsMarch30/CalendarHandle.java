package SeleniumSessionsMarch30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumSessions.BrowserUtil;

public class CalendarHandle {

	 static WebDriver driver;

	    public static void main(String[] args) throws InterruptedException {

	        BrowserUtil br = new BrowserUtil();
	        driver = br.init_driver("chrome");
	        br.launchUrl("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

	        driver.findElement(By.id("datepicker")).click();
	        Thread.sleep(2000);


	        //  driver.findElement(By.xpath("//a[text()='25']")).click();
	        //  selectDate("25");
	//
//	     List<WebElement> daysList=   driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
//	        System.out.println(daysList.size());
	//
//	        for(WebElement e : daysList){
//	            if(e.getText().equals("10")){
//	                e.click();
//	                break;
//	            }
//	        }

	        By calendar = By.cssSelector("table.ui-datepicker-calendar a");

	       // selectDate(calendar, "24");
	      //  selectDate("31", "a");

	        selectCalendarDate("30","March","2022");

	    }

	    public static String[] getMonthYear(String monthYearVal){
	        return monthYearVal.split(" ");
	    }

	    public static void selectCalendarDate(String exDay, String exMonth, String exYear ){

	        if(exMonth.equals("February") && Integer.parseInt(exDay)>29){
	            System.out.println("wrong date: " + exMonth + " : " + exDay);
	            return;
	        }

	      String monthYearValue =  driver.findElement(By.className("ui-datepicker-title")).getText();
	        System.out.println(monthYearValue);

	        while(!(getMonthYear(monthYearValue)[0].equals(exMonth) && getMonthYear(monthYearValue)[1].equals(exYear))){
	            //click on next icon
	            System.out.println(monthYearValue);
	            driver.findElement(By.xpath("//a[@title='Next']")).click();
	            monthYearValue =  driver.findElement(By.className("ui-datepicker-title")).getText();


	        }

	        selectDate(exDay,"a");
	    }






	    public static void selectDate(String day, String htmlTag) {
	        driver.findElement(By.xpath("//"+htmlTag+"[text()='" + day + "']")).click();
	    }


	    public static void selectDate(By locator, String day) {
	        List<WebElement> daysList = driver.findElements(locator);
	        System.out.println(daysList.size());

	        for (WebElement e : daysList) {
	            if (e.getText().equals(day)) {
	                e.click();
	                break;
	            }
	        }


	    }
}
