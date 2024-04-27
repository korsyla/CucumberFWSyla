package com.neotech.seleniumsteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class ActionsExample extends CommonMethods {
	
	@When("I use the Actions Class")
	public void i_use_the_actions_class() 
	{
	    
//		http://webdriveruniversity.com/Actions/index.html
		
		Actions action = new Actions(driver);
		
		WebElement elementToBeDragged = driver.findElement(By.id("draggable"));
		WebElement elementToBeDroped = driver.findElement(By.id("droppable"));
		
		//Drag and Drop / We always have to use .perform at the END!
		action.dragAndDrop(elementToBeDragged, elementToBeDroped).perform();;
		
		//Click and Hold
		action.clickAndHold(elementToBeDragged).moveToElement(elementToBeDroped).pause(1000).release().perform();
		
		wait(1);
		
		//Double Click
		WebElement doubleClickButton = driver.findElement(By.xpath("double-click"));
		
		//Double Click & we give the parameter of element that we want to doubleClick on
		action.doubleClick(doubleClickButton).perform();
		
		//Mouse Hover over Elements
		List<WebElement> hoverButtons = driver.findElements(By.xpath("//div[@id='div-hover']/div/button"));
		
		for(WebElement hoverButton : hoverButtons) 
		{
			action.moveToElement(hoverButton).perform();
			wait(1);
		}
		
		
		//Click and Hold
		WebElement clickAndHoldButton = driver.findElement(By.id("click-box"));
		action.clickAndHold(clickAndHoldButton).pause(2000).release().pause(1000).clickAndHold(clickAndHoldButton).pause(1000).release().perform();
		
		
		
	}

}
