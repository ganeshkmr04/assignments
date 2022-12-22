package week2.day2.home.assignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneInputComponents {

	public static void main(String[] args) {
		
		String url="https://www.leafground.com/input.xhtml";
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);
		
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Type your name
		chrome.findElement(By.xpath("//h5[text()='Type your name']/following-sibling::div//input")).sendKeys("Ganesh Kumar");


		//Append Country to this City.
		chrome.findElement(By.xpath("//h5[text()='Append Country to this City.']/following-sibling::div//input")).sendKeys(" India");
	
		//Verify if text box is disabled
		if(!(chrome.findElement(By.xpath("//h5[text()='Verify if text box is disabled']/following-sibling::div//input")).isEnabled())) {
			System.out.println("Textbox is Disabled");
		}
		
		//Clear the typed text.
		chrome.findElement(By.xpath("//h5[text()='Clear the typed text.']/following-sibling::div//input")).clear();
		
		//Retrieve the typed text.
		String textVal=chrome.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following-sibling::div//input")).getAttribute("Value");
		System.out.println(textVal);
		
		//Type email and Tab. Confirm control moved to next element.
		chrome.findElement(By.xpath("//h5[contains(text(),'Type email and Tab')]/following-sibling::div//input")).sendKeys("ganeshkumar65@gmail.com",Keys.TAB);
		
		//Type about yourself
		chrome.findElement(By.xpath("//h5[contains(text(),'about yourself')]/following-sibling::div//textarea")).sendKeys("I am Ganesh. Studying Selenium Web Driver in TestLeaf");

		
		//Just Press Enter and confirm error message*
		chrome.findElement(By.xpath("//h5[contains(text(),'confirm error message')]/following-sibling::div//input")).sendKeys(Keys.ENTER);
		
		
		
		String errorMsg=chrome.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		if (errorMsg.equals("Age is mandatory")) {
			 System.out.println("Error Message: "+errorMsg);
			 chrome.findElement(By.xpath("//h5[contains(text(),'confirm error message')]/following-sibling::div//input")).sendKeys("18",Keys.ENTER);
		}
		
		//Click and Confirm Label Position Changes
		chrome.findElement(By.xpath("//h5[contains(text(),'Label Position Changes')]/following-sibling::span//input")).click();
		
		//Type your name and choose the third option
		chrome.findElement(By.xpath("//h5[contains(text(),'choose the third option')]/following-sibling::div//li/input")).sendKeys("Ganesh");
		chrome.findElement(By.xpath("//body[contains(@class,'main-body')]/span//li[3]")).click();
		
		//Type your DOB (mm/dd/yyyy) and confirm date chosen
		String dobDate="4",dobMonth="6",dobYear="1987",dob=dobMonth+"/"+dobDate+"/"+dobYear;
		chrome.findElement(By.xpath("//h5[contains(text(),'Type your DOB')]/following-sibling::span//input")).sendKeys(dob);
		if(chrome.findElement(By.xpath("//a[contains(@class,'active')]")).getText().equals(dobDate)) {
			System.out.println(dob+" Confirmed");
		}
		chrome.findElement(By.xpath("//a[contains(@class,'active')]")).click();
		
		//Type number and spin to confirm value changed
		chrome.findElement(By.xpath("//h5[contains(text(),'spin to confirm')]/following-sibling::span//input")).sendKeys("5");
		chrome.findElement(By.xpath("//a[contains(@class,'ui-spinner-up')]")).click();	
		
		//Type random number (1-100) and confirm slider moves correctly
		chrome.findElement(By.xpath("//h5[contains(text(),'confirm slider moves')]/following-sibling::input[1]")).sendKeys("45");
		
		//Click and Confirm Keyboard appears
		chrome.findElement(By.xpath("//h5[contains(text(),'Confirm Keyboard appears')]/following-sibling::input[1]")).click();
		if(!(chrome.findElements(By.xpath("//button[contains(@class,'keypad-key')]")).isEmpty())) {
			System.out.println("Keypad Confirmed");
		}

	}
}
