package week7.marathon.tc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateOpportunity extends BaseClassSalesForce {

	@Test (priority=2, dataProvider="getDetails")
	public void runCreateOpportunity(String opportunityName,String amount) throws InterruptedException {
		
		String type="New Customer", leadSource="Partner Referral", stage="Needs Analysis";
		String closeDate="2/20/2023";

		driver.findElement(By.xpath("//span[text()='Home']/../..")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='View All Key Deals']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following-sibling::div[1]/input")).sendKeys(opportunityName);
		
		driver.findElement(By.xpath("//label[text()='Type']/following::button[1]")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item//span[text()='"+type+"']")).click();
		
		driver.findElement(By.xpath("//label[text()='Lead Source']/following::button[1]")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item//span[text()='"+leadSource+"']")).click();
		
		driver.findElement(By.xpath("//label[text()='Amount']/following::input[1]")).sendKeys(amount);
		
		driver.findElement(By.xpath("//label[text()='Stage']/following::button[1]")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item//span[text()='"+stage+"']")).click();

		driver.findElement(By.xpath("//label[text()='Primary Campaign Source']/following::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Primary Campaign Source']/following::ul/li[2]//span[2]/span")).click();

		driver.findElement(By.xpath("//label[text()='Close Date']/following::input[1]")).sendKeys(closeDate);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(3000);
		if( driver.getTitle().contains(opportunityName)){
			System.out.println("Oppourtunity "+opportunityName+ " Created Successfully");
		}else {
			System.out.println("Have Some Issue in Creating Oppourtunity "+opportunityName);
		}
	}
	
	@DataProvider(name="getDetails")
	public String[][] getOppDetails() throws IOException {
		String sheet="Sheet2";
		
		return ReadDataFromExcel.readData(sheet);
	}
}
