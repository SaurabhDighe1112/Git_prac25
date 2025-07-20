package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlActions {
	
	private static WebDriver driver;
	
	public static WebDriver launchBrowser(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;
	}
	
	public static void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sleep(int timeInMiliSeconds) {
		try {
			Thread.sleep(timeInMiliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clickOn(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public static void clickOnID(String string) {
		driver.findElement(By.id(string)).click();
	}
	
	public static int getElementsCount(String path) {
	    return driver.findElements(By.xpath(path)).size();
	}
	
	public static void quit() {
		driver.quit();
	}
}
