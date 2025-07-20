/*
 * 	Que: How many people against each department?
 *	HashMap<String, Integer>
 *	Employee Department → Employee Id
 */

package SeleniumAssignments;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_8 {
	WebDriver driver;
	
	@BeforeClass
	public void start() {
		driver = ControlActions.launchBrowser("http://automationbykrishna.com");
	}
	
	@Test
	public void getDeptHeadCount() {
		driver.findElement(By.cssSelector("#demotable")).click();
		Map<String, Integer> headCountMap = new LinkedHashMap<>();
		for(int index=1;index<=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr")).size(); index++) {
			String key = driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+index+"]/td[5]")).getText();
			if(headCountMap.containsKey(key)) {
				headCountMap.put(key, headCountMap.get(key)+1);
			}else
				headCountMap.put(key, 1);
		}
		System.out.println(headCountMap);
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
