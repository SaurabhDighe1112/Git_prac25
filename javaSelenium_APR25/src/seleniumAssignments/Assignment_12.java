/*
 * 	Assignment 12: [17 July 2025]
 *	1) https://demo.automationtesting.in/Register.html
 *	Click to the 'Register' menu >> Choose file >> Select any file >> check validations (if any) >> verify selected file  got uploaded and file name get displayed next to the  'Choose file' button.
 */

package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_12 {
	WebDriver driver;
	
	@BeforeClass
	public void start() {
		driver = ControlActions.launchBrowser("https://demo.automationtesting.in/Register.html");
	}
	
	@Test
	public void uploadFile(){
		String name = "21.png";
		String path = "C:\\Users\\HP\\Downloads\\21.png";
		WebElement upload = driver
				.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-6'][2]/input[@type='file']"));

		upload.sendKeys(path);

		String actualValue = upload.getAttribute("value");
		Assert.assertTrue(actualValue.contains(name));
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
