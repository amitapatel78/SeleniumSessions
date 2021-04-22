package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomXpath_1 {

	public static void main(String[] args) {
		//xpath:
		//1.abs xpath: /html/body/div/div[2]/div[1]/ul/li/span--text
		//relative/custom xpath: use diff features and functions
		
		//formula for creating xpath single attributes
		//htmltag[@attr='value']

		//www.Orangehrm.com
		//inspect firstname
		//input[@id='Form_submitForm_FirstName'] --1 element
		//input[@name='FirstName'] --1 element
		//input[@type='text'] --6 element
		
		// when we want to use multiple attributes
		// for ex - id,name and type together
		//htmltag[@attr1='value' and @attr2='value' and @attr3='value']
		//input[@id='Form_submitForm_FirstName' and @type='text']
		//input[@id='Form_submitForm_FirstName' and @type='text' and @name='FirstName']
		//input[@id='Form_submitForm_FirstName' and @type='text' and @name] -- this is also right xpath whether we give value to name or not 
		//input[@id='Form_submitForm_FirstName' and @type and @name] -- this is also right xpath
		//input[@id and @type and @name] -- it will give 17 elements where id,type and name is available
		
		
		//www.app.hubspot.com
		//inspect email address
		//input[@class='form-control private-form__control login-email']
		
		By email = By.xpath("//input[@class='form-control private-form__control login-email']");
		By email1 = By.className("//input[@class='form-control private-form__control login-email']"); // this is the wrong syntax 
		// in above syntax there are three classes - form-control, private-form_control and login-email so we can not use by.classname)
		
		//index:
		//www.Orangehrm.com
		//capture group
		//input[@type='text'] -- this will give 6 elements 
		//if we want to reach to the first element we need to combine entire xpath in a bracket
		//(//input[@type='text']) - bracket around the xpath is called capture group
		//(//input[@type='text'])[1] - now we need to pass index here to find exact element- here index start from 1 not from 0
		//(//input[@type='text'])[position()=1] -- position is a function 
		
		//text: used for elements where text is already available: text function is used where text is avaliable
		//h1 h2 h3 span li link 
		//www.freshworks.com
		//inspect text - Refreshing business software that your teams will love
		//h2[text()='Refreshing business software that your teams will love']
		//inspect customers link from top nav
		//a[text()='Customers'] -- 1 of 2 links 
		//ul[@class='footer-nav']//a[text()='Customers'] -- to reach to the second element
		
		//classic.crmpro.com
		//inspect Maketing campaigns
		//h3[text()='Marketing Automation']
		
		
		//contains() : is used to handle dynamic elements with dynamic text and attributes:
		//htmltag[contains(@attr,'value')]
		//demo.opencart.com
		//input[contains(@id,'input-email')] -- when we need to use contains we use comma
		//input[contains(@id,'email')] 
//		<input id=test_123> // dynamic id where test_ is constant
//		<input id=test_124>
//		<input id=test_125>
//		<input id=test_126>	
		
		//input[contains(@id,'test_')]
		//htmltag[contains(text(),'value'] -- value we can pass partial text
		//h2{contains(text(),'Refreshing business software')] -- 		//www.freshworks.com
		
		//htmltag[contains(@attr,'value')and contains(text(),'value')]
		//htmltag[contains(@attr1,'value')and contains(@attr2,'value')]
		//input[contains(@id,'_FirstName') and contains(@name,'First')] //orangehrm.com
		
		//hubspot.com
		//input[contains(@class,'login-email')] -- email field
		
		
		//starts-with() -- it should have text starts with
		//h2[starts-with(text(),'Refreshing business software')]
		//h2[starts-with(text(),'Refreshing')]
		
		//contains and starts-with together
		//htmltag[contains(@attr1,'value') and starts-with(@attr2,'value')
		//hubspot.com
		//input[contains(@id,'user')and starts-with(@type,'email')]
		
		//parent-child:  'single slash '/' direct child  - double slash '//' indirect child
		//ul[@class='footer-nav']/li -- with one '/' only direct child elements
		//ul[@class='footer-nav']//li -- with double '//' direct + indirect child elements
		//footerLinkclass
		//ul[@class='footer-nav']/li or 	//ul[@class='footer-nav']/li/a both are same
		
		// parent - child
		//hubspot.com
		//div[@class='private-form__input-wrapper']/child::input[@id='username'] -- instead of // we can use child keyword - generally we do not use it
		
		// child to parent
		// app.hubspot.com
		// backword traversing - we need to use /..
		// input[@id='username']/../../../../../../../../../../..
		// input[@id='username']/[parent::div -- instead of writing ../../ we can use
		// parent key word as well

		// child to ancestor (Grand Parent -- ancestor)
		// input[@id='username']/ancestor::div

		// radio button:
		// (//label[@class='radio-inline'])[position()=1]/input
		// (//label[@class='radio-inline'])[position()=2]/input

		// label[normalize-space()='No']
		// label[normalize-space()='Yes']

		// *[@id="username"]-300
		// input[@id="username"]-10
			
		
		
		
		
	}

}
