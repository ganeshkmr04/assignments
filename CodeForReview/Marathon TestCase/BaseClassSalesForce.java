package week7.marathon.tc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClassSalesForce {
	
	ChromeOptions chromeoption;
	ChromeDriver driver;
	
	
	@Parameters({"url","username","password"})
	@Test
	public void runAtFirst(String url,String sfUser,String sfPassword) throws InterruptedException {
		
		chromeoption=new ChromeOptions();
		chromeoption.addArguments("--disable-notifications");
		driver=new ChromeDriver(chromeoption);
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("username")).sendKeys(sfUser);
		driver.findElement(By.id("password")).sendKeys(sfPassword);
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Search apps or items...')]/following-sibling::div/input")).sendKeys("Content");
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		//Thread.sleep(10000);
	}
	
	  @Test(priority=3) 
	  public void runAtLast() 
	  { 
		  driver.close(); 
	  } 
}

