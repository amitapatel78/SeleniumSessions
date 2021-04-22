package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1AccountLoginPageOpenCart extends Assignment1BaseTest{
	
	@Test(priority = 1)
	public void demoCartTitleTest() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}

	@Test(priority = 2)
	public void demoCartUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));
	}

	@Test(priority = 3)
	public void doLogintest() {
		driver.findElement(By.id("input-email")).sendKeys("amitaspatel@yahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("Demo123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
}
