package com.neotech.seleniumsteps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class HandlingSwitchToWindow extends CommonMethods {
	
	@When("I switch to the window ten times")
	public void i_switch_to_the_window_ten_times() throws InterruptedException 
	{
	   WebElement differentWindow = driver.findElement(By.id("windowButton"));
	   differentWindow.click();
	    Thread.sleep(1000);
	    
	    //At this point we have 2 windows open. but focus is still on the first original window
	    
	    Set<String> allHandles = driver.getWindowHandles();
	    
	    //This is not a safe way to do a Iterator cus set doesn't maintain order
	    Iterator<String> it = allHandles.iterator();
	    String handle1 = it.next();
	    String handle2 = it.next();
	    
	    for(int i =1; i<10; i++) 
	    {
	    	driver.switchTo().window(handle1);
	    	Thread.sleep(500);
	    	driver.switchTo().window(handle2);
	    	Thread.sleep(500);
	    }
	    
	    driver.close(); // Will close only the Current Window/Tab it has focus on
	    
	    
	    
	}

}
