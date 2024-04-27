package com.neotech.seleniumsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class HandlingFrames extends CommonMethods {
	
	@When("I handle a frame")
	public void i_handle_a_frame() throws InterruptedException 
	{
		// https://the-internet.herokuapp.com/iframe
		
		// 3 Ways to switch to frame, 1st way BY INDEX, 2nd Way ID/Or Name / 3rd Way by WebElement
		//1st way BY INDEX
//		driver.switchTo().frame(0);
		
		//2nd Way by ID/Or Name
//		driver.switchTo().frame("mce_0_ifr");
		
		//3rd Way by WebElement is the BESTTT WAYYYY
		WebElement frameWebElement = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frameWebElement);
		Thread.sleep(1000);
		
		WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		
		//Lets clear the text in the box first 
		textBox.clear();   
		Thread.sleep(1000);
		textBox.sendKeys("Seria A is not better than Premier League");
		Thread.sleep(1000);
		
		//Once we're in the IFrame, we have to switch back to the defaultContent or Outside the IFrame,
		//before working with elements outside the IFrame
		
		//We have to switch the focus back to the main page/defaultContent
		driver.switchTo().defaultContent();
		
		//Now we can find elements after switching back to main page
		driver.findElement(By.linkText("Elemental Selenium"));
		
		
	}

}
