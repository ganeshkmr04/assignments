package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url_1="http://leaftaps.com/opentaps";
		
		ChromeDriver driverChrome=new ChromeDriver();
		driverChrome.get(url_1);
		
		WebElement webeleUser=driverChrome.findElement(By.xpath("//input[@id='username']"));
		webeleUser.sendKeys("Demosalesmanager");
		WebElement webelePass=driverChrome.findElement(By.xpath("//input[contains(@name,'PASSWORD')]"));
		webelePass.sendKeys("crmsfa");
		WebElement webeleSubmit=driverChrome.findElement(By.xpath("//input[contains(@class,'decorative')]"));
		webeleSubmit.click();
		
		WebElement webeleLink=driverChrome.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		webeleLink.click();
		
		WebElement webeleLink1=driverChrome.findElement(By.xpath("//a[text()='Leads']"));
		webeleLink1.click();

		WebElement webeleLink2=driverChrome.findElement(By.xpath("//a[contains(text(),'Create')]"));
		webeleLink2.click();

	}

}
