/*
Q1 : How many tables are there on the Demo table page, [answer: 4]
Q2 : how many rows in table1. [answer : 5]
Q3 : how many columns in table1. [asnwer : 4]
Q4 : print all the headers from table1.
output : #
         FirstName
         LastName
         UserName
        
Q5 : print data of first row from table1.

Q6 : print data of all the rows from table1.

Q7: Return list of all the usernames.
output : [mkanani, kkanani, dboda, asharma, ppatro]

Q8 : Return unique set of all the lastnames.
output : [Kanani, Boda, Sharma, Patro]
    
Q9 : find all the duplicate lastname from the Employee Basic Information table.
output : Kanani
 */

package SeleniumAssignments;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_6 {
	static WebDriver driver;
	
	@Test
	public void test6_1(){
		System.out.println("Q1 : How many tables are there on the Demo table page");
		driver = ControlActions.launchBrowser("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		List<WebElement> listOfElements = driver.findElements(By.xpath("//table"));
		System.out.println("No of Tables on web page are->"+listOfElements.size());
		Assert.assertEquals(listOfElements.size(), 4);
		
		System.out.println("Q2 : how many rows in table1");
		listOfElements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println("No of rows in Table 1 are->"+listOfElements.size());
		Assert.assertEquals(listOfElements.size(),5);
		
		System.out.println("Q3 : how many columns in table1");
		listOfElements = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println("No of rows in Table 1 are->"+listOfElements.size());
		Assert.assertEquals(listOfElements.size(),4);
		
		System.out.println("Q4 : print all the headers from table1");
		listOfElements = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		String[] expectedElements = {"#","First Name","Last Name","Username"};
		int index=0;
		for(WebElement e : listOfElements) {
			Assert.assertEquals(expectedElements[index++], e.getText());
			System.out.println(e.getText());
		}
		
		System.out.println("Q5 : print data of first row from table1.");
		listOfElements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		expectedElements = new String[] {"1","Maulik","Kanani","mkanani"};
		index=0;
		for(WebElement e : listOfElements) {
			Assert.assertEquals(expectedElements[index++], driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td["+index+"]")).getText());
			System.out.println(e.getText());
		}
		
		System.out.println("Q6 : print data of all the rows from table1");
		for(int rowIndex=1; rowIndex<=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();rowIndex++) {
			for(int i=1; i<=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td")).size(); i++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td["+i+"]")).getText()+" ");
			}
			System.out.println();
		}
		
		System.out.println("Q7: Return list of all the usernames");
		listOfElements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		String[] strArr = new String[listOfElements.size()];
		for(int rowIndex=1; rowIndex<=listOfElements.size(); rowIndex++) {
			strArr[rowIndex-1] =driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td[4]")).getText();
		}
		System.out.println(Arrays.toString(strArr));
		
		System.out.println("Q8 : Return unique set of all the lastnames");
		listOfElements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		Set<String> hsOfLastNames = new LinkedHashSet<String>();
		for(int rowIndex=1; rowIndex<=listOfElements.size(); rowIndex++) {
			hsOfLastNames.add(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td[3]")).getText());
		}
		System.out.println(hsOfLastNames);
		
		System.out.println("Q9 : find all the duplicate lastname from the Employee Basic Information table");
		listOfElements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		Map<String, Integer> mapOfLastNames = new LinkedHashMap<>();
		for(int rowIndex=1; rowIndex<=listOfElements.size(); rowIndex++) {
			String text = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+rowIndex+"]/td[3]")).getText();
			if(mapOfLastNames.containsKey(text)) {
				mapOfLastNames.put(text, mapOfLastNames.get(text)+1);
			}else
				mapOfLastNames.put(text,1);
		}
		Set<String> keySet = mapOfLastNames.keySet();
		for(String str : keySet) {
			if(mapOfLastNames.get(str)>1)
				System.out.println(str);
		}
		
		System.out.println("Q10. Quit Browser");
		driver.quit();
	}
}
