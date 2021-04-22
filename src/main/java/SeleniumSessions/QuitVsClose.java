package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amita.patel\\IdeaProjects\\Learning\\src\\test\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch the browser
		//Session id - ChromeDriver: chrome on WINDOWS (156d3ecc70a893d76c77f3c2d4911899)
		driver.get("http://www.google.com");//enter the url
		//ChromeDriver: chrome on WINDOWS (156d3ecc70a893d76c77f3c2d4911899)
		String title = driver.getTitle();//get the title
		//ChromeDriver: chrome on WINDOWS (156d3ecc70a893d76c77f3c2d4911899)
		System.out.println("page title is: "+ title);
		
		//verification/checkpoint : act vs Exp -- this is important
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getPageSource());
		
		
		driver.quit();
		//ChromeDriver: chrome on WINDOWS (156d3ecc70a893d76c77f3c2d4911899)
		driver.close();// example - session id = 123
		// once we close the browser we need to initialize the browser again
		driver = new ChromeDriver(); // 456 - new session id will be generated the moment we close the browser.
		driver.get("http://www.google.com");// enter the url
		
		System.out.println(driver.getTitle());
		//ChromeDriver: chrome on WINDOWS (null)
		// NOSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	}

}
