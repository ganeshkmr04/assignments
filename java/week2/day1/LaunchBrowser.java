package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driverChrome=new ChromeDriver();
		EdgeDriver driverEdge=new EdgeDriver();
		driverChrome.get("http://facebook.com");
		driverEdge.get("http://facebook.com");
		
	}
}
