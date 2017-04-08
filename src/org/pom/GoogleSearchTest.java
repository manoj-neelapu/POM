package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {
//sample comment
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", 
//				"G:\\Selenium_Learning\\chromedriver_win32\\chromedriver.exe");
		
//		System.setProperty("webdriver.chrome.driver",
//				"G:\\Selenium_Learning\\chromedriver_win32\\chromedriver.exe");
//	    // To remove message "You are using an unsupported command-line flag: --ignore-certificate-errors.
//	    // Stability and security will suffer."
//	    // Add an argument 'test-type'
//	    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//	    ChromeOptions options = new ChromeOptions();
//	    options.addArguments("test-type");
//	    capabilities.setCapability("chrome.binary","<<your chrome path>>");
//	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", 
				"G:\\Selenium_Learning\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com");
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		page.txtSearch.sendKeys("Selenium");
		
		page.btnSearch.click();
		
		

		
	
	}

}
