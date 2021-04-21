package SeleniumSessionsMarch22;

import org.openqa.selenium.WebDriver;

import SeleniumSessions.BrowserUtil;

public class CustomCSS {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		
		//css selector
		//cascaded style sheets
		
		//id -> #{id}  or htmltag#id
		//class-> .{classname} or htmltag#classname
		//#input-firstname
		//.form-control
		//#username
		//.form-control.private-form__control.login-email
		
		
		
		
	}

}
