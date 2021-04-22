package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		//headless - do not show the browser
				//fast
				//no browser display
				//not recommended -- not that stabled for complex application
				//only for sanity/smoke -- 5 to 10 TCS
				WebDriverManager.chromedriver().setup();
			//	WebDriverManager.firefoxdriver().setup();
				
				ChromeOptions co = new ChromeOptions();
				//co.addArguments("--headless");//switch -- this argument will decide you run it in headless or not
				co.addArguments("--incognito");
				
			//	FirefoxOptions fo = new FirefoxOptions();
			//	fo.addArguments("--headless");
			//	WebDrier driver = new FirefoxDriver(fo);
				
				WebDriver driver = new ChromeDriver(co);
				driver.get("http://www.google.com");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.quit();
				
			

	}

}
