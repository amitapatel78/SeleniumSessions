package SeleniumSessions;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCheckBoxSelectUsingStream {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		

//		List<WebElement> linksList = driver.findElements(By.xpath("//input[@name='contact_id']"));	
//		List<String> contactlist = linksList.stream()
//				.filter(ele -> ele.getText().contains("Chandru Selvam"))
//					.forEach(ele -> System.out.println(ele))
//					
//					
//						.collect(Collectors.toList());
//		contactlist	.stream().forEach(e -> e.click());		
		
		// need to click only three  check boxes with name 'Chandru Selvam'
		
//		List<String>contactList = 		linksList.stream()
//					.filter(e -> e.contains("Chandru Selvam"))
//						.forEach(ele -> System.out.println(ele));
//
////							.filter(ele -> !ele.getText().isEmpty())
////								//.filter(ele -> ele.getText().contains("Chandru Selvam"))
////									.map(ele -> ele.getText())
////										.collect(Collectors.toList());
//		contactsList.stream().forEach(e -> System.out.println(e));	
////		
	}
}