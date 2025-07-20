//How many columns are there in table 1

package demotables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.Test;

import base.ControlActions;

public class TC3 {
	@Test
	public void columCountInTable() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		List<WebElement> listOfWebElements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int size=listOfWebElements.size();
		System.out.println("Number of Columns in Table 1 is ->"+size);
		Assert.assertEquals(5, size);
		driver.quit();
	}
}
