/*
 * 	Step 1 Launch browser
 *	Step 2 Load http://automationbykrishna.com
 *	Step 3 Navigate to Registration form >> Login section
 *	Step 4 Enter the user name
 *	Step 5 Enter the password which is less than 8 characters
 *	Step 6 Click on Login button.
 *	Step 7 Verify that "Failed! please enter strong password" message is shown.
 */

package SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_1 {
	@Test
	public void test1() {
		System.out.println("Step 1 Launch browser");
		System.out.println("Step 2 Load http://automationbykrishna.com");
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		
		System.out.println("Step 3 Navigate to Registration form >> Login section");
		driver.findElement(By.id("registration2")).click();
		
		System.out.println("Step 4 Enter the user name");
		driver.findElement(By.id("unameSignin")).sendKeys("sdighe");
		
		System.out.println("Step 5 Enter the password which is less than 8 characters");
		driver.findElement(By.id("pwdSignin")).sendKeys("12345");		
		
		System.out.println("Step 6 Click on Login button");
		driver.findElement(By.id("btnsubmitdetails")).click();
		
		String passMsg = "Success!";
		String failedMsg ="Failed! please enter strong password";
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(failedMsg, alert.getText());
		alert.accept();
		
		System.out.println("Step 7 Enter the password greater than 8 characters");
		driver.findElement(By.id("pwdSignin")).sendKeys("123456789");		
		
		System.out.println("Step 8 Click on Login button");
		driver.findElement(By.id("btnsubmitdetails")).click();
		Assert.assertEquals(passMsg, alert.getText());
		alert.accept();
		
		System.out.println("Step 9 Quit browser");
		driver.quit();
	}
}
