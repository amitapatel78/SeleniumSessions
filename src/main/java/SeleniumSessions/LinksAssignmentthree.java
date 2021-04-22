package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksAssignmentthree {
static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		//By links = By.tagName("a");
		By links = By.xpath(""
		+ "//div[@class = 'navFooterLine navFooterLinkLine navFooterDescLine']//a");
		List<WebElement> linksList = getElements(links);
		System.out.println("total links: " + linksList.size());
		
		List<String> linksTextList = getElementsTextList(links);
		for (String e : linksTextList) {
		System.out.println(e);
			
			
		}
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			if (!e.getText().isEmpty()) {
				eleTextList.add(e.getText());
			}
		}
		return eleTextList;
	}


}
