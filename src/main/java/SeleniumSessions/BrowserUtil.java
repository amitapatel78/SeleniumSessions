package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	WebDriver driver;

	/**
	 * This method is used to initialize the WebDriver on the basis of given
	 * browsername
	 * 
	 * @param browserName
	 * @return This method returns the driver
	 */
	public WebDriver init_driver(String browserName) {

		System.out.println("browser name is : " + browserName);

		switch (browserName) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amita.patel\\IdeaProjects\\Learning\\src\\test\\drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Amita.patel\\IdeaProjects\\Learning\\src\\test\\drivers\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "edge":
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Amita.patel\\IdeaProjects\\Learning\\src\\test\\drivers\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass the correct browser : " + browserName);
			break;
		}

		return driver;
	}

	/**
	 * Generic functions/ Wrapper functions/ generic utilities / browser library on top of Selenium library
	 * @param url
	 */
	public void launchUrl(String url) {
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
