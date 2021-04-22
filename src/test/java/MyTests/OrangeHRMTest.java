package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{
//	WebDriver driver;
//	@BeforeTest
//	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//	}
//	
//	@Test
//	public void orangeHRMTitleTest() {
//		Assert.assertEquals(driver.getTitle(), "Free Human Resource Management Software | 30 Day Trial Creation");
//	}
//	
//	@Test
//	public void orangeHRMUrlTest() {
//	Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm"));
//	}
//	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}

	
	@Test(priority = 2)
	public void orangeHRMTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Free Human Resource Management Software | 30 Day Trial Creation");
	}

	@Test(priority = 3)
	public void orangeHRMUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm"));
	}

	@Test(priority = 1)
	public void orangeHRMFreeTrailButtonTest() {
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Assert.assertTrue(driver.findElement(By.cssSelector(".contact-ohrm")).isDisplayed());
	}

}


