/*
 * 	1. How many managers you have in EMPLOYEE MANAGER table?
 *	2. Get the total employees reporting to each Manager [Employee Manager ID]
 *	[20209 =3, 20205 = 4, 10101 =2]
 */

package SeleniumAssignments;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_9 {
	WebDriver driver;
	
	@BeforeClass
	public void start() {
		driver = ControlActions.launchBrowser("http://automationbykrishna.com");
	}
	
	private Map<Integer, Integer> getMapManagerTeamSize(){
		Map<Integer, Integer> mapOfManagerTeamSize = new LinkedHashMap<>();
		for(int index=1; index<=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr")).size(); index++) {
			Integer key = Integer.parseInt(driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+index+"]/td[4]")).getText());
			if(mapOfManagerTeamSize.containsKey(key)) {
				mapOfManagerTeamSize.put(key, mapOfManagerTeamSize.get(key)+1);
			}else
				mapOfManagerTeamSize.put(key, 1);
		}
		return mapOfManagerTeamSize;
	}
	
	@BeforeMethod
	public void navigateToDemoTables() {
		driver.findElement(By.id("demotable")).click();
	}
	
	@Test
	public void getManagerCount() {
		Map<Integer, Integer> map = getMapManagerTeamSize();
		Assert.assertEquals(3, map.size());
		System.out.println("No of Managers is =>"+map.size());
	}
	
	@Test
	public void getManagerTeamCount() {
		Map<Integer, Integer> map = getMapManagerTeamSize();
		String[] mapContent = {"20209=3", "20205=4", "10101=2"};
		Assert.assertEquals(mapContent[0], "20209"+"="+map.get(20209));
		Assert.assertEquals(mapContent[1], "20205"+"="+map.get(20205));
		Assert.assertEquals(mapContent[2], "10101"+"="+map.get(10101));
		System.out.println(map);
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
