/*
Step 1 Launch browser
Step 2 Load http://automationbykrishna.com
Step 3 Navigate to Basic Elements form >> Click on JavaScript Confirmation button
Step 4 Verify that alert appears.
Step 5 Verify that the message is "Are you are doing your homework regularly, Press Okay else Cancel!!"
Step 6 Click on "Cancel" button.
Step 7 Verify "You pressed Cancel!! " text below the JavaScript Confirmation button
 */

package seleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_3 {

	@Test
	public void test3() {
		System.out.println("Step 1 Launch browser\r\n"+"Step 2 Load http://automationbykrishna.com");
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		
		System.out.println("Step 3 Navigate to Basic Elements form >> Click on JavaScript Confirmation button");
		driver.findElement(By.id("basicelements")).click();
		driver.findElement(By.id("javascriptConfirmBox")).click();
		
		System.out.println("Step 4 Verify that alert appears");
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Step 5 Verify that the message is \"Are you are doing your homework regularly, Press Okay else Cancel!!\"");
		Assert.assertEquals("Are you are doing your homework regularly, Press Okay else Cancel!!",alert.getText());
		
		System.out.println("Step 6 Click on \"Ok\" button.");
		alert.accept();
		
		System.out.println("Step 7 Click on \"Ok\" button.");
		Assert.assertEquals(driver.findElements(By.xpath("//p[text()='You pressed OK!']")).get(0).getText(), "You pressed OK!");
		
		System.out.println("Step 8 click on JavaScript Confirmation button");
		driver.findElement(By.id("javascriptConfirmBox")).click();
		
		alert.dismiss();
		
		System.out.println("Step 9 Verify \"You pressed Cancel!! \" text below the JavaScript Confirmation button");
		Assert.assertEquals(driver.findElements(By.xpath("//p[text()='You pressed Cancel!']")).get(0).getText(), "You pressed Cancel!");
		
		System.out.println("Step 10 Quit driver");
		driver.quit();
	}
}
