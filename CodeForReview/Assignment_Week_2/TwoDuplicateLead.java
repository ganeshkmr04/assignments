package assignmentweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoDuplicateLead {

	public static void main(String[] args) {
		//Initializing the url, username and password
		String url="http://leaftaps.com/opentaps/control/login";
		String user="democsr", pass="crmsfa";

		//Launch Chrome and loding a url
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(url);

		//Maximize the browser window
		chrome.manage().window().maximize();

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
		chrome.findElement(By.xpath("//li[@class=' x-tab-strip-active']/following-sibling::li/following-sibling::li/a[2]")).click();
		chrome.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ganeshkumar65@gmail.com");
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();

		//Get the first lead id from the list and stored in leadId and click id link
		String leadId=chrome.findElement(By.xpath("//div[@class='x-grid3-scroller']/div[1]/div[1]//tr/td[3]/div[1]/a")).getText();
		chrome.findElement(By.xpath("//div[@class='x-grid3-scroller']/div[1]/div[1]//tr/td[3]/div[1]/a")).click();
		
		//Click on Duplicate Lead link
		chrome.findElement(By.linkText("Duplicate Lead")).click();

		//Verifying the tile is Duplicate Lead
		if(chrome.findElement(By.id("sectionHeaderTitle_leads")).getText().equals("Duplicate Lead")) {
			//Click on Create Lead submit button which create duplicate lead
			chrome.findElement(By.xpath("//input[@name='submitButton']")).click();
		}

		//Confirming the Duplicate Lead created by Name.
		if(chrome.findElement(By.id("viewLead_firstName_sp")).getText().equals(leadId)) {
			System.out.println("Duplicated Lead was Confirmed By the Name");
		}

		chrome.close();
	}

}
