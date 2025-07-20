package demotables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ControlActions;

public class Assignment_5_Tables_TestNG {
	private static WebDriver driver;
	//Launch Browser and open required webpage
//	@Test
//	public void setupWebPage() {
//		ControlActions.launchBrowser("http://automationbykrishna.com");
//		ControlActions.sleep();
//		ControlActions.clickOnID("demotable");
//		ControlActions.sleep();
//	}
	
	//How many tables in webPage
	@Test
	public void countOfTablesinWebPage() {
		WebDriver driver = ControlActions.launchBrowser("http://automationbykrishna.com");
//		driver.manage().window().maximize();
//		driver.get("http://automationbykrishna.com");
		driver.findElement(By.id("demotable")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int noOfTables = driver.findElements(By.xpath("//table")).size();
		System.out.println("no Of Tables-> "+noOfTables);
		Assert.assertEquals(noOfTables, 4);
		//driver.quit();
	}
	
	//How many rows are there in table 1
		@Test
		public void rowsCountInTable1() {
			int rowsCount = driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th")).size();
			System.out.println("Total row count in Table 1 is -> "+rowsCount);
			//Assert.assertEquals(rowsCount, 4);
		}
	
	//How many columns are there in table 1
	@Test
	public void columnCountInTable1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int columnCount = (driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"))).size();
		System.out.println("Total column count in Table 1 is -> "+columnCount);
		Assert.assertEquals(columnCount, 5);
	}
	
	//Print all header from table 1
	@Test
	public void printHeader() {
		int size = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size();
		String[] arr = {"#","First Name", "Last Name", "Username"};
		for(int i=1;i<=size;i++) {
			Assert.assertEquals(arr[i-1], (driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th["+i+"]")).getText()));
			System.out.println(driver.findElement(By.xpath("//table[@id='table1']/thead/tr/th["+i+"]")).getText());
		}
	}
	
	//print data of first row from table 1
	@Test
	public void printData() {
		
	}
}
