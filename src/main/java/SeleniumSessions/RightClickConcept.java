package SeleniumSessions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).perform();

		By rightClickOption = By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span");
		selectRightClickOption(rightClickOption, "Edit");
		Thread.sleep(5000);
	
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		//handle alert js pop
		//again click on right click button
		selectRightClickOption(rightClickOption, "Cut");
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert.getText();
		System.out.println(text1);
		
	}
	
	
	public static void selectRightClickOption(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
	//			break;
			}
		}
	}
	
	
	
}
