//How many rows are there in table 1

package demotables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class TC2 {
	@Test
	public void howManyRowsInTable() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th"));
		System.out.println("Table row count is-> "+list.size());
		Assert.assertEquals(4, list.size());
		driver.quit();
	}
}
