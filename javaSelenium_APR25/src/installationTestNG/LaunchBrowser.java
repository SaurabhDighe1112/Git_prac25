package installationTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowser {

	@Test
	public void launcher() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com");
		
		driver.findElement(By.id("basicelements")).click();
		Thread.sleep(2000);
		
		boolean flag = driver.findElement(By.xpath("//button[@onClick='myFunctionPopUp()']")).isEnabled();
		
		Assert.assertFalse(flag);
		driver.quit();
	}
}
