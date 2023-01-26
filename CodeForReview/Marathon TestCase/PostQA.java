package week7.marathon.tc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PostQA extends BaseClassSalesForce{
	
	@Test (dataProvider="getDetails", priority=1)
	public void runPostQueries(String question, String details){
		
		driver.findElement(By.xpath("//span[text()='Chatter']/../..")).click();
		driver.findElement(By.xpath("//span[text()='Question']/..")).click();
		driver.findElement(By.tagName("textarea")).sendKeys(question);
		driver.findElement(By.xpath("//div[contains(@data-placeholder,'If you have more to say')]")).sendKeys(details);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		
		if(driver.findElement(By.xpath("//span[contains(text(),'" + question +"')]")).getText().equals(question)) {
			if(driver.findElement(By.xpath("//span[contains(text(),'" + details +"')]")).getText().equals(details)) {
				System.out.println("Question and Details Appears Successfully");
			}else {
				System.out.println("Details Not Appears"); }
		}else {
			System.out.println("Question and Details Not Appears"); 
		}	 
	}
	
	@DataProvider (name="getDetails")
	public String[][] getQADetails() throws IOException{

		String sheet="Sheet1";
		return ReadDataFromExcel.readData(sheet);
	}	
}
