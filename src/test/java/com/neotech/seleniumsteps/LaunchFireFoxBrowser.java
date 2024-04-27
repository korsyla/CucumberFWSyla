package com.neotech.seleniumsteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class LaunchFireFoxBrowser extends CommonMethods {
	
	@When("I launch the firefox Browser")
	public void i_launch_the_firefox_browser() throws InterruptedException 
	{
	    WebDriver driver = new ChromeDriver();
	    
	    String url = "https://the-internet.herokuapp.com/";
	    driver.get(url);
	    
	    Thread.sleep(2000);
	    
	    String currentURL = driver.getCurrentUrl(); // 
	    
	    if(url.equals(currentURL)) 
	    {
	    	System.out.println("URLs are the same");
	    }
	    else 
	    {
	    	System.out.println("URL's are different");
	    }
	    
	    
	    String urlTitle = driver.getTitle();
	    System.out.println("URL Title is -> " + urlTitle);
	    
	    driver.quit();
	    
	}

}
