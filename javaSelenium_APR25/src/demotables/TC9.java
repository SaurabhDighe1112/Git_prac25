//find all duplicate lastName from table 1

package demotables;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class TC9 {

	@Test
	public void findDuplicateLastNamesFromTable() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		Map<String, Integer> mapOfLastName = new LinkedHashMap<>();
		
		for(int index=1; index<=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size(); index++) {
			String lastName = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+index+"]/td[3]")).getText();
			if(mapOfLastName.containsKey(lastName))
				mapOfLastName.put(lastName, mapOfLastName.get(lastName)+1);
			else
				mapOfLastName.put(lastName, 1);
		}
		Set<String> setOfKeys = mapOfLastName.keySet();
		System.out.println("Below are duplicate lastNames from table");
		for(String lastName : setOfKeys) {
			if(mapOfLastName.get(lastName)>1) {
				Assert.assertEquals("Kanani", lastName);
				System.out.println(lastName);
			}
		}
		
		driver.quit();
	}
}
