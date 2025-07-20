//Print unique lastName from table 1

package demotables;

import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.ControlActions;

public class TC8 {

	@Test
	public void printAllUniqueLastName() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		Set<String> listOfLastNames = new LinkedHashSet<>();
		for(int index=1; index<=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size(); index++) {
			listOfLastNames.add(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+index+"]/td[3]")).getText());
		}
		System.out.println(listOfLastNames);
		driver.quit();
	}
}
