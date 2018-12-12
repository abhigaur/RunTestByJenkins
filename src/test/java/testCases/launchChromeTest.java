package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchChromeTest {
	
	
	@Test
	public void launchGoogleHome(){
			 
	System.setProperty("webdriver.chrome.driver", "C:\\jenkin\\src\\test\\resources\\runner\\chromedriver.exe");
	 
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	 
	// Open facebook
	driver.get("http://www.google.com");
	 
	// Maximize browser
	 
	driver.manage().window().maximize();
	 
	}

}
