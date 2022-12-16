package assignmentweek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoEditLead {

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

		chrome.findElement(By.xpath("//div[@class='x-tab-panel-bwrap']//input[@name='firstName']")).sendKeys("Ganesh");
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		chrome.findElement(By.xpath("//div[@class='x-grid3-scroller']/div[1]/div[1]//tr/td[1]/div[1]/a")).click();

		//Verifying the tile is View Lead
		if(chrome.findElement(By.id("sectionHeaderTitle_leads")).getText().equals("View Lead")) {
			//Click on Edit Lead link
			chrome.findElement(By.linkText("Edit")).click();
		}
		String updatedCompany="Microsoft Inc";
		
		chrome.findElement(By.id("updateLeadForm_companyName")).clear();
		chrome.findElement(By.id("updateLeadForm_companyName")).sendKeys(updatedCompany);
		chrome.findElement(By.xpath("//input[@value='Update']")).click();
			
		
		if(chrome.findElement(By.id("viewLead_companyName_sp")).getText().contains(updatedCompany))
			System.out.println("Update Successful");
		
		chrome.close();
	}

}
