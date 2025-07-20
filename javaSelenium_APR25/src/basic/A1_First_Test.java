package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_First_Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Automation_Testing/2025/Git_prac25/javaSelenium_APR25/resources/First-page.html");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}