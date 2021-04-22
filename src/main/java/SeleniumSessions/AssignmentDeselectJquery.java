package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDeselectJquery {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		
		By choice = By.cssSelector(".comboTreeItemTitle");
		selectChoice(choice, "selectall");
		deSelectChoice(choice,"deselectall");
	}
	
public static void selectChoice(By locator, String... value) {
		
		List<WebElement> choiceList = driver.findElements(locator);

		if (!value[0].equalsIgnoreCase("selectall")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}

			}
		}
		// select all the values:
		else {
			try {
				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {

			}
		}
	}
public static void deSelectChoice(By locator, String... value) {
	
	List<WebElement> choiceList = driver.findElements(locator);

	if (!value[0].equalsIgnoreCase("deselectall")) {
		for (int i = 0; i < choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);

			for (int j = 0; j < value.length; j++) {
				if (text.equals(value[j])) {
					choiceList.get(i).click();
					break;
				}
			}

		}
	}
	// select all the values:
	else {
		try {
			for (WebElement e : choiceList) {
				e.click();
			}
		} catch (Exception e) {

		}
	}
}


}
