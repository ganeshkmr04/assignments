package assignmentweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OneLanuchFacebook {
	public static void main(String[] args) {
		
		String url="https://en-gb.facebook.com/";
		
		//Launch the ChromeDriver
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);
		
		//Maximize the Window
		Options manage1 =chrome.manage();
		Window window=manage1.window();
		window.maximize();
		
		//Setting implicit wait for 20Sec
		chrome.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Clicking on "Crete New Account" Button
		WebElement webele_1=chrome.findElement(By.linkText("Create New Account"));
		webele_1.click();
		
		//Filling first name and last name
		WebElement firstName=chrome.findElement(By.name("firstname"));
		firstName.sendKeys("Meera");
		
		WebElement lastName=chrome.findElement(By.name("lastname"));
		lastName.sendKeys("Jasmin");	
		
		//Filling mobile number
		WebElement emailMobile=chrome.findElement(By.name("reg_email__"));
		emailMobile.sendKeys("8080180088");
		
		//Filling  a new passowrd
		WebElement newPassword=chrome.findElement(By.id("password_step_input"));
		newPassword.sendKeys("Jasmin1234");
		
		//Filling date of birth (Date,Month and Year)
		WebElement dobDate=chrome.findElement(By.id("day"));
		Select date=new Select(dobDate);
		date.selectByVisibleText("10");
		
		WebElement dobMonth=chrome.findElement(By.id("month"));
		Select month=new Select(dobMonth);
		month.selectByVisibleText("Jul");
		
		WebElement dobYear=chrome.findElement(By.id("year"));
		Select year=new Select(dobYear);
		year.selectByVisibleText("1989");
		
		//Selecting a gender using click
		WebElement gender=chrome.findElement(By.xpath("//input[contains(@id,'u_2_4_')]"));
		gender.click();
		
	}
}
