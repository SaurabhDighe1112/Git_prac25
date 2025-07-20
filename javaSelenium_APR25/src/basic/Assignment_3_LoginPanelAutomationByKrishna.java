package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_3_LoginPanelAutomationByKrishna {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("http://automationbykrishna.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("registration2")).click();
		driver.findElement(By.id("fullName")).sendKeys("Saurabh Navnath Dighe");
		driver.findElement(By.id("address")).sendKeys("Rose E Meher Rahatani Pune 411017");
		driver.findElement(By.id("useremail")).sendKeys("saurabh@gmail.com");
		driver.findElement(By.id("usercity")).sendKeys("Pune");
		driver.findElement(By.id("organization")).sendKeys("Dassault Systemes Hinjewadi");
		try {
			driver.findElement(By.id("radio-01")).click();
		}catch(ElementClickInterceptedException e) {
			js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("radio-01")));
			driver.findElement(By.id("radio-01")).click();
		}
		driver.findElement(By.id("usernameReg")).sendKeys("Saurabh");
		driver.findElement(By.id("passwordReg")).sendKeys("saurabh123");
		driver.findElement(By.id("repasswordReg")).sendKeys("saurabh123");
		
		driver.findElement(By.id("signupAgreement")).click();
		
		driver.findElement(By.id("btnsubmitsignUp")).click();
		
		
		Alert alert = driver.switchTo().alert();
		String submitionText=alert.getText();
		if(submitionText.equalsIgnoreCase(submitionText)) {
			System.out.println("Submission Done");
		}else
			System.err.println(submitionText);
		
		alert.accept();
		
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		}catch(ElementClickInterceptedException e) {
			js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[contains(text(),'Login')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		}
		
		
		driver.findElement(By.id("userid")).sendKeys("saurabh");
		driver.findElement(By.id("password")).sendKeys("saurabh123");
		driver.findElement(By.id("btnlogin")).click();
		
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Login Signup Demo"))
			System.out.println("Test Passed");
		else
			System.err.println("Failed");
		
		driver.quit();
	}
}
