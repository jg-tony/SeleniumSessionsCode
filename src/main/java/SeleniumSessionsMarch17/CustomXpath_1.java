package SeleniumSessionsMarch17;



public class CustomXpath_1 {

	
	public static void main(String[] args) {

		// xpath
		// 1. abs xpath : /html/body/div/div[2]/div[1]/ul/li/span -- text
		// 2. relative /custom xpath : use different xpath features and functions.

		// html tag [@attribute='value']
		// //input[@id='Form_submitForm_FrstName']
		// input[@name='FirstName']
		// input[@type='text']
		// htmltag[@attr1='value' and @attr2='value2' and @attr3='value'] -- multiple
		// attributes.

		

		/**
		 * index: (//input[@type='text'])[1] (//input[@type='text'])[position()=2]
		 * brackets() are important
		 * 
		 * text function - text() : used for elements where text is already available.
		 * h1 h2 h3 span , li, link //h2[text()='Refreshing business software that your
		 * team will love'] //ul[@class='footer-nav']//a[text()='Customers']
		 * 
		 * //h3[text()='Marketing Campaigns'] contains(): is used to handle dynamic
		 * elements with dynamic text and attributes: //htmltag[@contains(attr,'value')]
		 * //input[contains(@id,'input-email']
		 * 
		 * <input id=test_123> <input id=test_134> <input id=test_124>
		 * <input id=test_125>
		 * 
		 * //input[contains(@id,'test_')]
		 * 
		 * //htmltag[contains(text(),'value')] -- finding textvlaue using contains.
		 * //h2[contains(text(),'Refreshing business software']
		 * 
		 * //htmltag[contains(attr,'value') and contains(text(),'value')]
		 * 
		 * //input[contians(@id,'_FirstName')and contains(@name,'First')]
		 * //input[contain(@class,'login-email')]
		 * 
		 * 
		 * //starts-with() 
		 *  //h2[starts-with(text(),'Refreshing']
		 *  //input[contains(@id,'user') and starts-with(@type,'email')]
		 *  
		 *  parent -child: 
		 * //ul[@class='footer-nav']/li -- only direct child elements
		 * 
		 * //ul[@class='footer-nav']//li  -- direct + indirect child elemenonlyts
 		 *  
		 * 	//input[@id='username']/../../../..     ..backward traversing  -- from child to parent. 
		 * 
		 *  
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
