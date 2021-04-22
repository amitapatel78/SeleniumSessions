package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
//		List<WebElement> footerList = driver.findElements(By.xpath("//ul[@class='footer-nav']/li/a"));
//		System.out.println(footerList.size());
//		
//		for(WebElement e: footerList) {
//			System.out.println(e.getText());
//		}
		
//		driver.get("https://classic.crmpro.com/index.html");
//		List<WebElement> footerLanguageList = driver.findElements(By.xpath("//ul[@class='list-unstyled']/li/a"));
//		
//		System.out.println(footerLanguageList.size());
//		
//		for ( WebElement e: footerLanguageList) {
//			System.out.println(e.getText());
//		}
//		
		
		//count links from one column - www.freshworks.com
//		(//ul[@class='list-unstyled'])[1]/li/a
//				(//ul[@class='list-unstyled'])[2]/li/a
//						(//ul[@class='list-unstyled'])[3]/li/a
//								(//ul[@class='list-unstyled'])[4]/li/a
		
		int colCount = driver.findElements(By.xpath("//ul[@class='list-unstyled'])")).size();
		List<String> colValList = new ArrayList<String>();
		for(int i=1; i<=colCount; i++) {
			List<WebElement> colList = 
					driver.findElements(By.xpath("//ul[@class='list-unstyled'])["+i+"]/li/a"));
			
				for(WebElement e : colList) {
					colValList.add(e.getText());
				}
			
		}
		System.out.println(colValList);
		
	}

}
