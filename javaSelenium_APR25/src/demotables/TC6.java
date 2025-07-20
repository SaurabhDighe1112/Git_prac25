//print data of all rows from table 1

package demotables;

import base.ControlActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC6 {

	@Test
	public void printAllTableData() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		for(int rowIndex=1; rowIndex<=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();rowIndex++) {
			System.out.print(driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th["+rowIndex+"]")).getText()+" ");
		}
		System.out.println();
		for(int rowIndex=1; rowIndex<=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();rowIndex++) {
			for(int index=1; index<=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td")).size(); index++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td["+index+"]")).getText()+" ");
			}
			System.out.println();
		}
		
		driver.quit();
	}
}
