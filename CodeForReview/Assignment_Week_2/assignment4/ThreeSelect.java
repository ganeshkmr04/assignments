package week2.day2.home.assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThreeSelect {

	public static void main(String[] args) {
		String url="https://www.leafground.com/select.xhtml";
		String xpathString="";
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);

		chrome.manage().window().maximize();
		
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		//Which is your favorite UI Automation tool?
		xpathString="//div[contains(@class,'grid ui-fluid')]//option[contains(text(),'Select Tool')]/parent::select";
		Select dropDown1=new Select(chrome.findElement(By.xpath(xpathString)));
		dropDown1.selectByVisibleText("Selenium");
		
		//Choose your preferred country.
		chrome.findElement(By.xpath("//label[text()='Select Country']")).click();
		chrome.findElement(By.xpath("//li[contains(@class,'ui-selectonemenu-item')][4]")).click();
		
		//Confirm Cities belongs to Country is loaded
		chrome.findElement(By.xpath("//h5[contains(text(),'Cities')]/following-sibling::div")).click();
		chrome.findElement(By.xpath("//li[text()='Select City']/following-sibling::li")).click();
		
		//Choose the Course
		chrome.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		chrome.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		//Choose language randomly
		chrome.findElement(By.xpath("//h5[contains(text(),'Choose language')]/following-sibling::div")).click();
		chrome.findElement(By.xpath("//li[text()='Tamil']")).click();
		
		//Select 'Two' irrespective of the language chosen
		chrome.findElement(By.xpath("//h5[contains(text(),'irrespective')]/following-sibling::div")).click();
		chrome.findElement(By.xpath("(//div[@class='ui-selectonemenu-items-wrapper'])[4]//li[2]")).click();
		
	}
}
