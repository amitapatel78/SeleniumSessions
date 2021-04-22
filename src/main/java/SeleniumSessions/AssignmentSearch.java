package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
		Thread.sleep(2000);
		
		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='ac_results']/ul/li"));
		
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			
			if (text.equals("Casual Dresses > Printed Dress")){
				e.click();
			}
		}
	}

}
