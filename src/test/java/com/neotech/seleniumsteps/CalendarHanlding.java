package com.neotech.seleniumsteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class CalendarHanlding extends CommonMethods {
	
	@When("I handle a calendar")
	public void i_handle_a_calendar() 
	{
		// Go to this link: https://jqueryui.com/datepicker/
		// Click on Datepicker from the left menu
		// Show the Calendar
		// Select 12/25/2024 from the Calendar
		// Verify that you have selected 12/25/2024
		
		
		wait(1);
		
		// 1st Way using the selenium Way
//		WebElement datepickerButton = driver.findElement(By.linkText("Datepicker"));
//		datepickerButton.click();
		
		click(driver.findElement(By.linkText("Datepicker")));
		wait(1);
		
		//However there is a iframe we need to SWITCH to first 
		
		//1st way Selenium way / nameOrId / Idex / WebElement -> WebElement is the BEST WAYYYY!!!!
		WebElement frameWebelement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frameWebelement);
//		wait(1);
		
		//2nd Way Common Methods
		switchToFrame(frameWebelement);
		wait(1);
		
		//Now we can click on the Calendar, which is inside the iframe
		click(driver.findElement(By.id("datepicker")));
		wait(2);
		
		String expectedMonthYear = "December 2024";
		
		while(true) // This is a infinite loop until it hits break; condition
		{
			WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String actualMonthYearText = monthYear.getText();
			
			if(actualMonthYearText.equals(expectedMonthYear)) 
			{
				break; //Once we break; the loop, it does NOT execute any line after that****
			}
			
			WebElement nextMonthYearButton = driver.findElement(By.xpath("//span[text()='Next']"));
			nextMonthYearButton.click();
			wait(1);
			
		}
		
		wait(1);
		
		//Now, lets click on the correct day -> 25th
		String expectedDay = "25";
		List<WebElement> allTheDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement day : allTheDays) 
		{
			if(day.getText().equals(expectedDay)) 
			{
				day.click(); //After we click we have to BREAK; the loop, otherwise it will just keep going
				break;
			}
		}
		
		wait(2);
		
		//Now lets verify that we selected the correct date -> 
		
		String expectedDate = "12/25/2024";
		
		WebElement dateTextBox = driver.findElement(By.id("datepicker"));
		System.out.println("Date that we selected is -> " + dateTextBox.getAttribute("value"));
		
		if(dateTextBox.getAttribute("value").equals(expectedDate)) 
		{
			System.out.println("Test Passed!");
		}
		else 
		{
			System.out.println("Test Failed!");
		}
		
		
		
	}

}
