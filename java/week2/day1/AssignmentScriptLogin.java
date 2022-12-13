package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentScriptLogin {
public static void main(String[] args) {
	
	String url_1="http://leaftaps.com/opentaps";
	
	ChromeDriver driverChrome=new ChromeDriver();
	driverChrome.get(url_1);
	
	WebElement webeleUser=driverChrome.findElement(By.id("username"));
	webeleUser.sendKeys("Demosalesmanager");
	WebElement webelePass=driverChrome.findElement(By.id("password"));
	webelePass.sendKeys("crmsfa");
	WebElement webeleSubmit=driverChrome.findElement(By.className("decorativeSubmit"));
	webeleSubmit.click();
	
	String url_2="https://login.salesforce.com/";
	
	ChromeDriver driverChrome1=new ChromeDriver();
	driverChrome1.get(url_2);
	
	WebElement webeleUser1=driverChrome1.findElement(By.id("username"));
	webeleUser1.sendKeys("hari.radhakrishnan@qeagle.com");
	WebElement webelePass1=driverChrome1.findElement(By.name("pw"));
	webelePass1.sendKeys("Testleaf$321");
	WebElement webeleSubmit1=driverChrome1.findElement(By.name("Login"));
	webeleSubmit1.click();
	
	
}
}
