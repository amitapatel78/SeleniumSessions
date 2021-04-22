package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		// geckoDriver - Mozilla
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Amita.patel\\IdeaProjects\\Learning\\src\\test\\drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");// enter the url

		String title = driver.getTitle();// get the title
		System.out.println("page title is: " + title);

		// verification/checkpoint : act vs Exp -- this is important
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		System.out.println(driver.getPageSource());

		driver.quit();
	}
}