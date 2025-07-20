package demotables;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class TC10 {
	
	public Map<String, Integer> getHashmapOfDept(WebDriver driver){
		Map<String, Integer> hashmapOfDept = new LinkedHashMap<>();
		for(int i=1;i<=driver.findElements(By.xpath("//div[@id='empmanager']//tbody/tr")).size();i++) {
			String str1 =driver.findElement(By.xpath("//div[@id='empmanager']//tbody/tr["+i+"]/td[5]")).getText();
			if(hashmapOfDept.containsKey(str1))
				hashmapOfDept.put(str1, hashmapOfDept.get(str1)+1);
			else
				hashmapOfDept.put(str1, 1);
		}
		
		return hashmapOfDept;
	}
	
	@Test
	public void getNoOfEmployeeinEachDept() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Map<String, Integer> hashmapOfDept = getHashmapOfDept(driver);
		System.out.println(hashmapOfDept);
		Assert.assertEquals(hashmapOfDept.get("7001-Admin"), 2);
		Assert.assertEquals(hashmapOfDept.get("7002-Finance"), 2);
		Assert.assertEquals(hashmapOfDept.get("7003-HR"), 2);
		Assert.assertEquals(hashmapOfDept.get("7013-IT"), 3);
		driver.quit();
	}
}
