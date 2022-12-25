package week4.day1.home.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignmentFour {

	public static void main(String[] args) {
		
		String url="https://dev110326.service-now.com/";
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Switching to a frame 0
		driver.switchTo().frame("gsft_main");
		
		//Entering Username, Password and Click Login.
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		
		//Switching back to main content.
		driver.switchTo().defaultContent();
	}
}
