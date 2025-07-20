/*
 * 	Assignment10: [16 July 2025]
 *	1) https://demo.automationtesting.in
 *	drag&drop all three elements using Actions class in drop area and verify they are present in the drop area (edited) 
 */

package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_10 {
	WebDriver driver;
	
	@BeforeClass
	public void start() {
		driver = ControlActions.launchBrowser("https://demo.automationtesting.in");				
	}

	@Test
	public void dragdrop() {
		driver.findElement(By.id("enterimg")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle' and text()='Interactions ']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/following-sibling::ul//a[text()='Drag and Drop ']")).click();
		
		driver.findElement(By.xpath("//ul[@class='childmenu ']//a[text()='Static ']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", driver.findElement(By.id("angular")));
		
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("angular"));
		WebElement target = driver.findElement(By.id("droparea"));
		action.dragAndDrop(source, target).perform();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='droparea']/img[@id='angular']")).isDisplayed());
		System.out.println("image1 drag dropped to drop area=>"+driver.findElement(By.xpath("//div[@id='droparea']/img[@id='angular']")).isDisplayed());
	
		source =driver.findElement(By.id("mongo"));
		target = driver.findElement(By.id("droparea"));
		action.dragAndDrop(source, target).perform();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='droparea']/img[@id='mongo']")).isDisplayed());
		System.out.println("image2 drag dropped to drop area=>"+driver.findElement(By.xpath("//div[@id='droparea']/img[@id='mongo']")).isDisplayed());
		
		source =driver.findElement(By.id("node"));
		target = driver.findElement(By.id("droparea"));
		action.dragAndDrop(source, target).perform();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='droparea']/img[@id='node']")).isDisplayed());
		System.out.println("image3 drag dropped to drop area=>"+driver.findElement(By.xpath("//div[@id='droparea']/img[@id='node']")).isDisplayed());
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}