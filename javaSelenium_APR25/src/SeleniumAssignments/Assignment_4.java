/*
Step 1 Launch browser
Step 2 Load http://automationbykrishna.com
Step 3 Navigate to Basic Elements form >> Click on JavaScript Confirmation PROMPT button.
Step 4 Verify that alert appears.
Step 5 Verify that the message is "Please enter your name : "
Step 6 Click on "Cancel" button.
Step 7 User cancelled the prompt. should be displayed.
Step 8 Enter anything in the text box and click Ok 
Step 7 Verify "Hello Saurabh! How are you today?" text below the JavaScript PROMPT button
 */

package SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_4 {

	@Test
	public void test4() {
		System.out.println("Step 1 Launch browser\r\n" + "Step 2 Load http://automationbykrishna.com");
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		
		System.out.println("Step 3 Navigate to Basic Elements form >> Click on JavaScript Confirmation PROMPT button.");
		driver.findElement(By.id("basicelements")).click();
		driver.findElement(By.id("javascriptPromp")).click();
		
		System.out.println("Step 4 Verify that alert appears.");
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Step 5 Verify that the message is \"Please enter your name : \"");
		Assert.assertEquals(alert.getText(), "Please enter your name :");
		
		System.out.println("Step 6 Click on \"Cancel\" button");
		alert.dismiss();
		
		System.out.println("Step 7 User cancelled the prompt. should be displayed");
		String expectedText = "User cancelled the prompt.";
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='User cancelled the prompt.']")).getText(), expectedText);
		
		System.out.println("Step 8 Enter name in Alert textbox");
		String name = "Saurabh";
		expectedText = "Hello "+name+"! How are you today?";
		driver.findElement(By.id("javascriptPromp")).click();
		alert.sendKeys(name);
		
		System.out.println("Step 9 Click on \"OK\" button");
		alert.accept();
		
		System.out.println("Step 10 Verify Greetings displayed");
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Hello "+name+"! How are you today?']")).getText(), expectedText);
		
		System.out.println("Step 11 Quit browser");		
		driver.quit();
	}
}
