//Que: Can you return a map from the EMPLOYEE BASIC INFORMATION table with Username → FirstName


package SeleniumAssignments;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_7 {
	static WebDriver driver;
	
	@BeforeClass
	public void start() {
		driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		System.out.println("Step 1: Launch Browser");
	}
	
	@Test
	public void getUserNameAndFirstNameMap() {
		driver.findElement(By.id("demotable")).click();
		Map<String, String> mapOfNameAndUserName = new LinkedHashMap<>();
		for(int index=1; index<=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size(); index++) {
			String firstName= driver.findElement(By.cssSelector("table#table1>tbody>tr:nth-child("+index+") td:nth-child(2)")).getText();
			String userName= driver.findElement(By.cssSelector("table#table1>tbody>tr:nth-child("+index+") td:nth-child(4)")).getText();
			mapOfNameAndUserName.put(firstName, userName);
		}
		System.out.println(mapOfNameAndUserName);
	}
	
	@AfterClass
	public void end() {
		driver.quit();
	}
}
