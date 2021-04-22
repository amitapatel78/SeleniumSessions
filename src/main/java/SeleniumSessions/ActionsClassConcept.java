package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// user actions: double click, right click, click, send keys
		// drag n drop , moveto element
		// Actions - class in Selenium

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

//		Actions act = new Actions(driver);
//
//		WebElement content = driver.findElement(By.className("menulink"));
//		act.moveToElement(content).perform();
//
//		Thread.sleep(3000);

	//	driver.findElement(By.linkText("COURSES")).click();// we have to use what is visible text on the page

		By content = By.className("menulink");
		By courses = By.linkText("COURSES");
		By articles = By.linkText("ARTICLES");
		By singleVideos = By.linkText("SINGLE VIDEOS");
		
		doActionsMoveToElement(content);
		Thread.sleep(2000);
		doActionClick(courses);
//		driver.findElement(By.linkText("COURSES")).click();
		doActionsMoveToElement(content);
		Thread.sleep(2000);
		doActionClick(articles);
//		driver.findElement(By.linkText("ARTICLES")).click();
		doActionsMoveToElement(content);
		Thread.sleep(2000);
//		driver.findElement(By.linkText("SINGLE VIDEOS")).click();
		doActionClick(singleVideos);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsMoveToElement(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}
	
	public static void doActionClick(By locator) {
		getElement(locator).click();
	}

}
