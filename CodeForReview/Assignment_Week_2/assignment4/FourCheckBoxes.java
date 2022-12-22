package week2.day2.home.assignment4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourCheckBoxes {

	public static void main(String[] args) {
		
		String url="https://www.leafground.com/checkbox.xhtml";
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);
		
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Basic Checkbox
		chrome.findElement(By.xpath("//input[@id='j_idt87:j_idt89_input']/following::div[1]")).click();
		
		//Notification
		chrome.findElement(By.xpath("//input[@id='j_idt87:j_idt91_input']/following::div[1]")).click();
		
		//Choose your favorite language(s)
		chrome.findElement(By.xpath("//input[@id='j_idt87:basic:0']/following::div[1]")).click();
		
		//Tri State Checkbox
		chrome.findElement(By.xpath("//input[@id='j_idt87:ajaxTriState_input']/following::div[1]")).click();
		chrome.findElement(By.xpath("//input[@id='j_idt87:ajaxTriState_input']/following::div[1]")).click();
		
		//Toggle Switch
		chrome.findElement(By.xpath("//input[@id='j_idt87:j_idt100_input']/following::div[1]")).click();
		
		//Verify if check box is disabled
		if(chrome.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isEnabled()) {
			System.out.println("CheckBox Enabled");
		}else {
			System.out.println("CheckBox Disabled");
		}
		
		//Select Multiple
		//Select Option1 as Paris
		chrome.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-multiple')]")).click();
		chrome.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-filter-container']/input")).sendKeys("Paris");
		chrome.findElement(By.xpath("//input[@aria-label='Select All']/following::div[1]")).click();
		//Select Option2 as London
		chrome.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-filter-container']/input")).clear();
		chrome.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-filter-container']/input")).sendKeys("London");
		chrome.findElement(By.xpath("//input[@aria-label='Select All']/following::div[1]")).click();
		//Close the Panel
		chrome.findElement(By.xpath("//a[@aria-label='Close']")).click();
	}

}
