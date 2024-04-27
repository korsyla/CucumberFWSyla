package com.neotech.seleniumsteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class CheckBoxRadioButton extends CommonMethods {
	
	@When("I click on checkboxes and RadioButton")
	public void i_click_on_checkboxes_and_radio_button() throws InterruptedException 
	{
		// Go to https://demoqa.com/automation-practice-form
		// Check Female
		// Select all the Hobbies
		// See if they are selected after you select each of them
		
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/automation-practice-form";
		driver.get(url);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		Thread.sleep(1000);
		
		//Finding Multiple elements / all Hobbies
		List<WebElement> hobbiesElements = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
		
		//I want to click on them one by one
		for(WebElement hobbieElement: hobbiesElements) 
		{
			hobbieElement.click();
			Thread.sleep(1000);
		}
		
		
		
		driver.quit();
		
		
		
	}

}
