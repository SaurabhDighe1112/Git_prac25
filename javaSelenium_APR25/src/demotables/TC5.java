//print data of first row from table 1

package demotables;

import base.ControlActions;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5 {
	
	@Test
	public void printDataFrom1stRow() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		List<String> firstRowData = new ArrayList<String>();
		int noOfCoulmns = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td")).size();
		for(int i=1;  i<=noOfCoulmns;i++) {
			firstRowData.add(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td["+i+"]")).getText());
		}
		
		System.out.println(firstRowData);
		String[] data = {"1","Maulik","Kanani","mkanani"};
		int index=1;
		for(String str : data) {
			Assert.assertEquals(str, driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td["+index+"]")).getText());
			index++;
		}
		
		driver.quit();
	}
}
