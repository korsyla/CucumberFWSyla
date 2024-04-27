package com.neotech.seleniumsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.utilities.CommonMethods;
import io.cucumber.java.en.When;

public class LoginSIS extends CommonMethods {
	
	@When("I log in the SIS Website")
	public void i_log_in_the_sis_website() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		String url = "http://neotechacademy-sis.com:9000/Test/";
		driver.get(url);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//1st Way
	    WebElement username = driver.findElement(By.id("tUsername"));
	    username.sendKeys("Admin");
	    Thread.sleep(2000);
	    
	    //2nd other way -> Method chaining
	    driver.findElement(By.id("tPassword")).sendKeys("Neotech@123");
	    Thread.sleep(2000);
	    
	   WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
	   loginButton.click();
	   Thread.sleep(2000);
	    
	}

}
