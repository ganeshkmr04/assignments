package week2.day2.home.assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwoButtons {
	public static void main(String[] args) {

		String url="https://www.leafground.com/button.xhtml";

		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);

		chrome.manage().window().maximize();
		
		//Click and Confirm title.
		chrome.findElement(By.id("j_idt88:j_idt90")).click();
		System.out.println("Title Of the Page: "+chrome.getTitle());
		
		//Getting back to the actual URL
		chrome.get(url);
		
		//Confirm if the button is disabled.
		if(!(chrome.findElement(By.id("j_idt88:j_idt92")).isEnabled())) {
			System.out.println("Button Disabled");
		}
		
		//Find the position of the Submit button
		String buttonPosition=chrome.findElement(By.id("j_idt88:j_idt94")).getLocation().toString();
		System.out.println("Button Co-Ordinates: "+buttonPosition);
		
		//Find the Save button color
		String colorValue=chrome.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");
		System.out.println("Button Color: "+colorValue);
		
		//Find the height and width of this button
		String buttonDimension=chrome.findElement(By.id("j_idt88:j_idt98")).getSize().toString();
		System.out.println("Submit Button Height and Width is: "+buttonDimension);
		
		//Mouse over and confirm the color changed
		WebElement ele=chrome.findElement(By.id("j_idt88:j_idt100"));
		Actions action=new Actions(chrome);
		action.moveToElement(ele).perform();
		String backColor=ele.getCssValue("background-color");
		System.out.println("Background Color On Mouse Over: "+backColor);
		
		//Click Image Button and Click on any hidden button
		chrome.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		//chrome.findElement(By.name("javax.faces.ViewState")).click();
		
		//How many rounded buttons are there?
		int roundButtonCount=chrome.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following::button[contains(@class,'rounded-button')]")).size();
		System.out.println("Rounded Button Count is: "+roundButtonCount);
	}
}
