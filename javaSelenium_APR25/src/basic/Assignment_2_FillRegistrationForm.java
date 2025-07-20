package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2_FillRegistrationForm {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Automation_Testing/2025/Git_prac25/javaSelenium_APR25/resources/First-page.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("fName")).sendKeys("Saurabh");
		driver.findElement(By.id("lName")).sendKeys("Dighe");
		driver.findElement(By.id("email")).sendKeys("saurabh@gmail.com");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='UITesting']")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@id='stream']")));
		select.selectByValue("ME");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//driver.findElement(By.xpath("//Button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='info-link']")).click();
	}
}
