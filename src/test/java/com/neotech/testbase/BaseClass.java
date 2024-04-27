package com.neotech.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.neotech.utilities.ConfigsReader;
import com.neotech.utilities.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	public static WebDriver driver;

	
	public static void setUp() throws InterruptedException 
	{
		 
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPETH);
				
		String browser = ConfigsReader.getProperty("browser");
	
		if(browser.toLowerCase().equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (browser.toLowerCase().equals("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.toLowerCase().equals("safari")) 
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}
		else 
		{
			System.out.println("Browser is NOT supported");
		}


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		driver.manage().window().maximize();
		String website = ConfigsReader.getProperty("url");
		driver.get(website);
		
		PageInitializer.initialize();
		
	}
	
	
	public static void tearDown() 
	{
		if(driver != null) 
		{
			driver.quit();
		}
		
		
	}
	
	

}
