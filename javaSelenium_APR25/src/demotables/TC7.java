//print all userNames from table 1

package demotables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.ControlActions;

public class TC7 {
	
	@Test
	public void printAllUserNameFromTable() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		
		for(int rowIndex=1; rowIndex<=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size(); rowIndex++){
			System.out.println(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td[4]")).getText());
		}
		driver.quit();
	}
}
