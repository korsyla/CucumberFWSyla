package com.neotech.seleniumsteps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class ScreenshotExample extends CommonMethods {
	
	@When("I take a screenshot")
	public void i_take_a_screenshot() 
	{
		
//		https://www.facebook.com/
		
		// Taking Screenshot of the whole page
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =  ts.getScreenshotAs(OutputType.FILE);
		File fileDestination = new File("screenshotsFile/FacebookLogin.png"); //Where do we want to save it?? 
		
		try 
		{
			Files.copy(source, fileDestination);
		} 
		catch (IOException e) 
		{
			System.out.println("Could NOT save the screenshot!");
			e.printStackTrace();
		}
		
		
		//Taking the screenshot of only partial part of the webPage / or WebElement (form) 
		WebElement form = driver.findElement(By.xpath("//form[@method='post']"));
		
		TakesScreenshot ts2 = (TakesScreenshot) form;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File fileDestination2 = new File("screenshotsFile/Form.png");
		
		try 
		{
			Files.copy(source2, fileDestination2);
		} 
		catch (IOException e) 
		{
			System.out.println("Could NOT save the screenshot!");
			e.printStackTrace();
		}
		
	    
	}

}
