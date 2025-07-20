/*
 * 	Assignment 11: [16 July 2025] https://demo.automationtesting.in
 *	alert → get text → ok
 *	alert → accept / cancel → assert messages
 *	alert → send keys → ok → compare sent keys
 */

package seleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_11 {
	WebDriver driver;
	
	@BeforeClass
	public void start() {
		driver = ControlActions.launchBrowser("https://demo.automationtesting.in");
		driver.findElement(By.id("enterimg")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle' and text()='SwitchTo']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle' and text()='SwitchTo']/following-sibling::ul//a[text()='Alerts']")).click();
	}
	
	@Test
	public void alertOK() {
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert = driver.switchTo().alert();
		String expectedText = "I am an alert box!";
		Assert.assertEquals(alert.getText(), expectedText);
		alert.accept();
	}
	
	@Test
	public void alertOKandCancel() {
		driver.findElement(By.xpath("//a[@class='analystic' and @href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String expectedText = "Press a Button !";
		
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), expectedText);
		alert.accept();
		expectedText = "You pressed Ok";
		Assert.assertEquals(driver.findElement(By.xpath("//p[@id='demo']")).getText(), expectedText);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		expectedText = "You Pressed Cancel";
		Assert.assertEquals(driver.findElement(By.xpath("//p[@id='demo']")).getText(), expectedText);
	}
	
	@Test
	public void textBox() {
		driver.findElement(By.xpath("//a[@class='analystic' and @href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		String expectedText = "Please enter your name";
		String name = "Saurabh";
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), expectedText);
		alert.sendKeys(name);
		alert.accept();
		String text = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		Assert.assertTrue(text.contains(name));
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
