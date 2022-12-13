package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CAssignment1 {

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

	}

}
