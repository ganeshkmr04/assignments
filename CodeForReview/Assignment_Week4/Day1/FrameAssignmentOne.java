package week4.day1.home.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameAssignmentOne {

	public static void main(String[] args) {
		
		//Launching Browser with URL
		String url="https://chercher.tech/practice/frames-example-selenium-webdriver";
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);
		
		//Maximize window and providing implicit wait time
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Getting the Topic before frame
		String topic=chrome.findElement(By.xpath("//label[text()='Topic : ']/span")).getText();
		
		//Switching to first Frame
		chrome.switchTo().frame(0);
		//Passing the topic received to textbox
		chrome.findElement(By.xpath("//b[contains(text(),'Topic')]/following::input")).sendKeys(topic);
		
		//Switching to nested frame inside first frame
		chrome.switchTo().frame(0);
		chrome.findElement(By.xpath("//b[contains(text(),'Inner Frame')]/following::input")).click();
		
		//Coming back out of all frames to main content
		chrome.switchTo().defaultContent();
		//Switching to second frame from main content
		chrome.switchTo().frame(1);
		
		//Select the dropdown using index value
		Select dropDown=new Select(chrome.findElement(By.id("animals")));
		dropDown.selectByIndex(1);
		
		//Switching to the main content
		chrome.switchTo().defaultContent();
		
	}
}
