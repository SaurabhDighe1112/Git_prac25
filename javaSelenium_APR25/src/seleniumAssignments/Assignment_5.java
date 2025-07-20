/*
Step 1: Launch browser
Step 2: Load  http://automationbykrishna.com
Step 3: Navigate to Basic  Element form
Step 4: Scroll till the  Selects label
Step 5: Verify is the first  dropdown is multiselect or not
Step 6: Verify the same for  the second dropdown is multiselect or not
Step 7: Select the  following options - 1, 3, 5
Step 8: Print the text of  the multiple options present in the list
Step 9: print the selected  options 
Step10: Deselect the  options from the multiselect dropdown [deselectByVisibleText(String text),  deSelectByValue(String value), deSelectByIndex(int index)]
Step 11: Verify the count of  the selected options [getAllSelectedOptions] 
Step 12: Deselect all the  options [deselectAll()]
Step 13: Verify that the  size is zero
 */

package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_5 {

	@Test
	public void test5() {
		
		System.out.println("Step 1: Launch browser\r\n"
				+ "Step 2: Load  http://automationbykrishna.com\r\n"
				+ "Step 3: Navigate to Basic  Element form");
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("basicelements")).click();
		
		System.out.println("Step 4: Scroll till the  Selects label");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement e = driver.findElement(By.xpath("//select[@class='form-control m-bot15']"));
		js.executeScript("arguments[0].scrollIntoView", e);
		
		WebElement selectTag = driver.findElement(By.xpath("//select[@class='form-control m-bot15']"));
		
		System.out.println("Step 5: Verify is the first  dropdown is multiselect or not");
		Select objSelect = new Select(selectTag);
		System.out.println("DropDown 1 is multiple selectable-> "+objSelect.isMultiple());
		
		System.out.println("Step 6: Verify the same for  the second dropdown is multiselect or not");
		selectTag = driver.findElement(By.xpath("//select[@class='form-control']"));
		objSelect = new Select(selectTag);
		System.out.println("DropDown 2 is multiple selectable-> "+objSelect.isMultiple());
		
		System.out.println("Step 7: Select the  following options - 1, 3, 5");
		objSelect.selectByVisibleText("1");
		objSelect.selectByVisibleText("3");
		objSelect.selectByVisibleText("5");
		
		System.out.println("Step 8: Print the text of the multiple options present in the list");
		List<WebElement> listOfOptions = objSelect.getOptions();
		for(WebElement str : listOfOptions) {
			System.out.print(str.getText()+" ");
		}
		System.out.println();
		
		System.out.println("Step 9: print the selected  options ");
		List<WebElement> listOfSelectedElements = objSelect.getAllSelectedOptions();
		for(WebElement str : listOfSelectedElements) {
			System.out.print(str.getText()+" ");
		}
		System.out.println();
		
		System.out.println("Step10: Deselect the first 2 options from the multiselect dropdown");
		objSelect.deselectByVisibleText("1");
		objSelect.deselectByVisibleText("3");
		
		System.out.println("Step 11: Verify the count of  the selected options");
		listOfSelectedElements = objSelect.getAllSelectedOptions();
		Assert.assertEquals(listOfSelectedElements.size(), 1);
		
		System.out.println("Step 12: Deselect all the  options");
		objSelect.deselectAll();
		
		System.out.println("Step 13: Verify that the  size is zero");
		listOfSelectedElements = objSelect.getAllSelectedOptions();
		Assert.assertEquals(listOfSelectedElements.size(), 0);
		
		System.out.println("Step 14: Quit Browser");
		driver.quit();
	}
}
