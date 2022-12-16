package assignmentweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwoCreateContact {

	public static void main(String[] args) {
		
		//Initializing the url, username and password
		String url="http://leaftaps.com/opentaps/control/login";
		String user="democsr", pass="crmsfa";
		
		//Launch Chrome and loding a url
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);
		
		//Maximize the browser window
		Options manage=chrome.manage();
		Window window=manage.window();
		window.maximize();

		//Login with username and password
		WebElement username=chrome.findElement(By.id("username"));
		username.sendKeys(user);
		WebElement password=chrome.findElement(By.id("password"));
		password.sendKeys(pass);
		WebElement login=chrome.findElement(By.className("decorativeSubmit"));
		login.click();
		
		//Traverse through the links by Click, CRM/SFA -> Contacts -> Create Contact
		chrome.findElement(By.linkText("CRM/SFA")).click();
		chrome.findElement(By.linkText("Contacts")).click();
		chrome.findElement(By.linkText("Create Contact")).click();
		
		//Enter the Firstname, Lastname, Firstname Local and LastName Local using id locator
		chrome.findElement(By.id("firstNameField")).sendKeys("Ganesh");
		chrome.findElement(By.id("lastNameField")).sendKeys("Kumar");
		chrome.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ganesh");
		chrome.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kumar");
		
		//Enter the department,description using name locator
		chrome.findElement(By.name("departmentName")).sendKeys("Human Resource");
		chrome.findElement(By.name("description")).sendKeys("I am From HR Department");
		
		//Enter email using id locator
		chrome.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ganeshkumar65@gmail.com");
		
		//Select province as New York using visible text
		Select province=new Select(chrome.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		province.selectByVisibleText("New York");
		
		//Click on Submit
		chrome.findElement(By.name("submitButton")).click();
		
		//Click on Edit and Clear the description using clear and update the important note
		chrome.findElement(By.linkText("Edit")).click();
		chrome.findElement(By.id("updateContactForm_description")).clear();
		chrome.findElement(By.id("updateContactForm_importantNote")).sendKeys("Cleared the Description");
		
		//Click on update using XPath
		chrome.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Displaying Title of the page 
		String pageTitle=chrome.getTitle();
		System.out.println("Page Title: "+pageTitle);
	}

}
