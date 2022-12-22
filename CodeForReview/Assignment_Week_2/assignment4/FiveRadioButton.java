package week2.day2.home.assignment4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiveRadioButton {

	public static void main(String[] args) {
		
		String url="https://www.leafground.com/radio.xhtml";
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);

		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Your most favorite browser
		chrome.findElement(By.xpath("//h5[contains(text(),'favorite browser')]/following-sibling::div//span[1]")).click();
		
		//UnSelectable
		chrome.findElement(By.xpath("//input[@value='Bengaluru']/../..")).click();
		
		//Find the default select radio button
		List<WebElement> lists=chrome.findElements(By.xpath("//h5[contains(text(),'default select radio button')]/following-sibling::div//td"));
		
		int i=1;
		for (WebElement webElement : lists) {
			
			String attr=webElement.getText();		
			
			String xpathString="(//h5[contains(text(),'default select radio button')]/following-sibling::div//td//input)["+i+"]";
			WebElement ele=webElement.findElement(By.xpath(xpathString));
			
			if(ele.getAttribute("checked") != null && ele.getAttribute("checked").equals("true")) {
				System.out.println("Default Checked Button is: "+attr);
			}
			i++;
		}
		
		//Select the age group (only if not selected)
		List<WebElement> lists1=chrome.findElements(By.xpath("//h5[contains(text(),'Select the age group')]/following-sibling::div//input"));
		
		i=0;
		for (WebElement webElement : lists1) {
			String attr=webElement.getAttribute("value");
			if(webElement.getAttribute("checked") != null && webElement.getAttribute("checked").equals("true")) {
				System.out.println("Already the Age Group Selected: " + attr);
				i++;
			}
		}
		if(i == 0) {
			chrome.findElement(By.xpath("(//h5[contains(text(),'Select the age group')]/following-sibling::div//input)[1]/../..")).click();
		}
	}
}