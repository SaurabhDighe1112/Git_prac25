/*
 * How many tables on webPage
 */

package demotables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class TC1 {
	
	@Test
	public void totalWebPage() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		ControlActions.sleep();
		int num = driver.findElements(By.xpath("//table")).size();
		System.out.println("Number of Tables on WebPage -> "+num);
		Assert.assertEquals(num, 4);
		driver.quit();
	}
}
