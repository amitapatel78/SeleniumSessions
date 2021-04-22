package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCarTest {
	
	public static void main (String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		//By emailId = By.id("input-email");
		By password = By.id("input-password");
		By register = By.linkText("Register");
		By firstName = By.name("firstname");
		By lastName = By.cssSelector("#input-lastname");
		By email = By.xpath("//*[@id=\"input-email\"]");
		By telePhone = By.id("input-telephone");
		By passwordConfirm = By.id("input-confirm");
		By privacyPolicy = By.name("agree");
		By conti = By.xpath("//input[@type='submit']");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		//eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		//eleUtil.doSendKeys(password, "test@123");
		eleUtil.doClick(register);
		eleUtil.doSendKeys(firstName, "Amita");
		eleUtil.doSendKeys(lastName, "Patel");
		eleUtil.doSendKeys(email, "test@abc.com");
		eleUtil.doSendKeys(telePhone, "23763432432");
		eleUtil.doSendKeys(password, "test123");
		eleUtil.doSendKeys(telePhone, "232424324324");
		eleUtil.doSendKeys(passwordConfirm, "test123");
		eleUtil.doClick(privacyPolicy);
		eleUtil.doClick(conti);
		
		
//		System.out.println(br.getPageTitle());
//		br.closeBrowser();
//		
		
	}

}
