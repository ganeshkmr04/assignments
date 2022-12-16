package assignmentweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeLoginAcme {

	public static void main(String[] args) {
		
		//Launching the ChromeDriver with input URL
		String url="https://acme-test.uipath.com/login";
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);
		
		//Entering the email and password and submit the Login button.
		WebElement email=chrome.findElement(By.xpath("//input[contains(@id,'email')]"));
		email.sendKeys("kumar.testleaf@gmail.com");
		
		WebElement password=chrome.findElement(By.xpath("//input[contains(@id,'password')]"));
		password.sendKeys("leaf@12");
		
		WebElement login=chrome.findElement(By.xpath("//button[contains(@class,'btn-primary')]"));
		login.click();
		
		//Getting the title of the page after login
		String title=chrome.getTitle();
		System.out.println("Web Page Title: " + title);
		
		//Logging Out from the system
		WebElement logout=chrome.findElement(By.linkText("Log Out"));
		logout.click();

		//Closing the current browser
		chrome.close();
	}

}
