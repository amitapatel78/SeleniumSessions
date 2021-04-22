package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAllOptionsHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		// drop down having: select - tag name
		// Select class from Selenium:

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
//		Select sel_indus = new Select(driver.findElement(industry));
//		List<WebElement> indusList = sel_indus.getOptions();
//		System.out.println(indusList.size());
//		
//		for(WebElement e : indusList) {
//			String text = e.getText();
//			System.out.println(text);
//				if(text.equals("Education")) {
//					e.click();
//					break;
//				}
//		}
		
		doSelectDropDownValue(industry, "Electronics");
		doSelectDropDownValue(country, "Benin");
		
	}	
	
	// when we need to select value w/o selecting by index, by visibletext and by value
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
				
	}
	
	public static void doSelectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals(value)) {
					e.click();
					break;
				}
		}
	}
	

	}
