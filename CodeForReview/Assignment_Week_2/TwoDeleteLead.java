//Pending getText();

package assignmentweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoDeleteLead {

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
		
		//Setting implicit wait for 20Sec
		chrome.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//Login with username and password
		chrome.findElement(By.id("username")).sendKeys(user);
		chrome.findElement(By.id("password")).sendKeys(pass);
		chrome.findElement(By.className("decorativeSubmit")).click();
		
		//Traverse through the links by Click, CRM/SFA -> Leads -> Find Leads
		chrome.findElement(By.linkText("CRM/SFA")).click();
		chrome.findElement(By.linkText("Leads")).click();
		chrome.findElement(By.linkText("Find Leads")).click();
		
		//Click on Phone Tab and Enter mobile number and Click on Find Leads Button
		chrome.findElement(By.xpath("//li[@class=' x-tab-strip-active']/following-sibling::li/a[2]")).click();
		chrome.findElement(By.name("phoneNumber")).sendKeys("");
		chrome.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys("8050180086");
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Get the first lead id from the list and stored in leadId
		String leadId=chrome.findElement(By.xpath("//div[@class='x-grid3-scroller']/div[1]/div[1]//tr/td[1]/div[1]/a")).getText();
		System.out.println(leadId);
		
		//Click on the id link and click delete.
		chrome.findElement(By.xpath("//div[@class='x-grid3-scroller']/div[1]/div[1]//tr/td[1]/div[1]/a")).click();
		chrome.findElement(By.className("subMenuButtonDangerous")).click();
		
		//Validating the deleted record from Find Leads-> Enter leadId -> Find Leads (button)
		chrome.findElement(By.linkText("Find Leads")).click();
		chrome.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//chrome.findElement(By.xpath("//input[@name='id']")).sendKeys("19857"); //19832
		//String message=chrome.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		//String message=chrome.findElement(By.className("x-paging-info")).getText();
/*		
		//Get the message from the paging info and confirm the successful deletion.
		String liMessage=chrome.findElement(By.xpath("//div[@class='x-panel-bbar']/div/div")).getText();
		//System.out.println("Message: "+ message);
		
		if(liMessage.equals("No records to display")) {
			System.out.println("Lead Deleted Successfully");
		}
*/
		chrome.close();
		
	}
}
