package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url_1="http://leaftaps.com/opentaps";
		
		ChromeDriver driverChrome=new ChromeDriver();
		driverChrome.get(url_1);
		
		WebElement webeleUser=driverChrome.findElement(By.id("username"));
		webeleUser.sendKeys("Demosalesmanager");
		WebElement webelePass=driverChrome.findElement(By.id("password"));
		webelePass.sendKeys("crmsfa");
		WebElement webeleSubmit=driverChrome.findElement(By.className("decorativeSubmit"));
		webeleSubmit.click();
		
		WebElement webeleLink=driverChrome.findElement(By.linkText("CRM/SFA"));
		webeleLink.click();
		
		WebElement webeleLink1=driverChrome.findElement(By.linkText("Leads"));
		webeleLink1.click();
		
		WebElement webeleLink2=driverChrome.findElement(By.linkText("Create Lead"));
		webeleLink2.click();	

		WebElement webeleSelect1=driverChrome.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdownSource=new Select(webeleSelect1);
		dropdownSource.selectByVisibleText("Conference");
		
		WebElement webeleSelect2=driverChrome.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdownIndustry=new Select(webeleSelect2);
		dropdownIndustry.selectByValue("IND_FINANCE");
		
		WebElement webeleSelect3=driverChrome.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdownOwnership=new Select(webeleSelect3);
		dropdownOwnership.selectByIndex(5);

	}

}
