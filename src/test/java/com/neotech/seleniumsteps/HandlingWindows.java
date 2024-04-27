package com.neotech.seleniumsteps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class HandlingWindows extends CommonMethods {
	
	@When("I handle a window")
	public void i_handle_a_window() throws InterruptedException 
	{
//		https://neotech.vercel.app/windows
		
		Thread.sleep(1000);
		
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		
		WebElement newGoogleTabButton = driver.findElement(By.xpath("//a[@id='tabButton']"));
		newGoogleTabButton.click();
		
		Thread.sleep(1000);
		
		//When we Open a new Window
		//We have to switch to the Newley Opened Window Before we can do anything to the new window/page
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String windowID : allWindows) 
		{
			//I want to switch to the 2nd window / Google Tab
			if(!windowID.equals(window1)) 
			{
				driver.switchTo().window(windowID);
			}
		}
		
		
		//Now That we're switched the 2nd Window, we can locate and work with elements in the second window
		driver.findElement(By.id("APjFqb")).sendKeys("Just Do it");
		
		
		
		Thread.sleep(2000);
		
	}

}
