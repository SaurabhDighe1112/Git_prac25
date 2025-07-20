/*
Step 1 Launch browser
Step 2 Load http://automationbykrishna.com
Step 3 Navigate to Basic Elements form >> Click on Alert button
Step 4 Verify that alert appears.
Step 5 Verify that the message is "You must be TechnoCredits student!!"
Step 6 Click on Ok button.
 */

package seleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_2 {
	
	@Test
	public void test2() {
		System.out.println("Step 1 Launch browser\r\n" + "Step 2 Load http://automationbykrishna.com");
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		
		System.out.println("Step 3 Navigate to Basic Elements form >> Click on Alert button");
		driver.findElement(By.id("basicelements")).click();
		driver.findElement(By.id("javascriptAlert")).click();
		
		System.out.println("Step 4 Verify that alert appears");
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Step 5 Verify that the message is \"You must be TechnoCredits student!!\"");
		Assert.assertEquals("You must be TechnoCredits student!!", alert.getText());
		
		System.out.println("Step 6 Click on Ok button.");
		alert.accept();
		
		System.out.println("Step 7 Quit browser");
		driver.quit();
	}
}
