package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_3_RegistrationPanelAutomationByKrishna {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("registration2")).click();
		driver.findElement(By.id("unameSignin")).sendKeys("Saurabh");
		driver.findElement(By.id("pwdSignin")).sendKeys("saurabh123");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("btnsubmitdetails")).click();
		
		
		Alert alert = driver.switchTo().alert();
		String submitionText=alert.getText();
		if(submitionText.equalsIgnoreCase(submitionText)) {
			System.out.println("Submission Done");
		}else
			System.err.println(submitionText);
		
		
	}
}
