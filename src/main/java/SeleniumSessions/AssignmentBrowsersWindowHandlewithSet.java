package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentBrowsersWindowHandlewithSet {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		BrowserUtil br = new BrowserUtil();
		driver = br.init_driver("chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on FaceBook']")).click();
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click(); //child page
//		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		//window handler API in selenium:
		Set<String> handles = driver.getWindowHandles();// Because window ids are in String so we set the Set<String>
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id: " + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window url:" + driver.getCurrentUrl());

	//	driver.close();//close the child window and driver is lost
		
		switchToWindowAndGetTitle(childWindowId);
		Thread.sleep(2000);
		br.closeBrowser();
		switchToWindowAndGetTitle(parentWindowId);
		
//		driver.switchTo().window(parentWindowId);
//		System.out.println("parent window url:" + driver.getCurrentUrl());
//		System.out.println("parent window title:" + driver.getTitle());
//		
//		driver.quit();

		
	}
	public static String switchToWindowAndGetTitle(String windowId) {
		driver.switchTo().window(windowId);
		String title = driver.getTitle();
//		driver.close();
		return title;
	}
	
}
