package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amita.patel\\IdeaProjects\\Learning\\src\\test\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch the browser
		driver.get("http://www.yahoo.com");//enter the url
		
		String title = driver.getTitle();//get the title
		System.out.println("page title is: "+ title);
		
		//verification/checkpoint : act vs Exp -- this is important
		if(title.equals("Yahoo")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getPageSource());
		
		driver.quit();

	}

}


