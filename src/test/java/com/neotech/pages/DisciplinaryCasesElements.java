package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.CommonMethods;

public class DisciplinaryCasesElements extends CommonMethods {
	
	
	@FindBy(id = "noncoreIframe")
	public WebElement iFrameDisciplinaryCases;
	
	@FindBy(xpath = "//div[@id='list_item_add']")
	public WebElement disciplinaryCasePlusButton;
	
	
	
	
	
	//This -> means we are going to use the driver for everything in THIS class, all the WebElements etc
		public DisciplinaryCasesElements() 
		{
			PageFactory.initElements(driver, this);
		}

}
