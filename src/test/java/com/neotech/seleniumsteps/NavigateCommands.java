package com.neotech.seleniumsteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class NavigateCommands extends CommonMethods {
	
	@When("I Navigate Commands")
	public void i_navigate_commands() throws InterruptedException 
	{
	    WebDriver driver = new ChromeDriver();
	    
	    String url = "https://www.instagram.com/";
//	    driver.get(url); // Will wait for page and elements to be loaded 
	    
	    driver.navigate().to(url); // Will NOT wait for page & elements to be loaded 
	    

	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    driver.navigate().to("https://www.mlssoccer.com/");
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://www.fifa.com/fifaplus/en");
	    Thread.sleep(2000);
	    
	    driver.navigate().back(); // This will bring us back one page back
	    Thread.sleep(1000);
	    
	    driver.navigate().forward(); // This brings up one page forward
	    
	    
	    driver.quit();
	    
	}

}
