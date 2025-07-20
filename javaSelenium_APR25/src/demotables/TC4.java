//Print all header from table 1

package demotables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class TC4 {
	
	@Test
	public void printAllHeadersFromTable() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		List<WebElement> listOfWebElement = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		for(int rowIndex=1;rowIndex<=listOfWebElement.size();rowIndex++) {
			System.out.println(driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th["+rowIndex+"]")).getText());
		}
		String[] list = {"#","First Name","Last Name","Username"};
		for(int index=0; index<list.length;index++) {
		Assert.assertEquals(list[index], driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th["+(index+1)+"]")).getText());
		}
		driver.quit();
	}
}
