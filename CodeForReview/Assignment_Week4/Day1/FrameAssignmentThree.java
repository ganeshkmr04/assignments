package week4.day1.home.assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignmentThree {

	public static void main(String[] args) {
		
		String url="https://buythevalue.in/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Switching to the chat frame and closing chat
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button")).click();
		driver.switchTo().defaultContent();
		
		//Closing the SignUp notification
		driver.findElement(By.xpath("//span[contains(text(),'Receive our latest discount codes')]/following-sibling::div/div")).click();
		
		//Selecting first item from the list
		driver.findElement(By.xpath("//a[contains(text(),'URBAN FIT X SMART WATCH')]")).click();

		//Entering the zip code, checkout and view cart
		driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("625515");
		driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']/input")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();

		//Clicking Checkout and managing alert
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
}
