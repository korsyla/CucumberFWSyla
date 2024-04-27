package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.CommonMethods;

public class AddDisciplinaryCaseElements extends CommonMethods {
	
	
	@FindBy(xpath = "//input[@id='addCase_employeeName_empName']")
	public WebElement employeeNameInput;
	
	@FindBy(xpath = "//div[@class='ac_results']")
	public WebElement employeeNameButton;
	
	@FindBy(xpath = "//input[@id='addCase_caseName']")
	public WebElement caseNameInput;
	
	@FindBy(xpath = "//textarea[@id='addCase_description']")
	public WebElement descriptioninput;
	
	@FindBy(xpath = "//a[@id='btnSave']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//div[@id='toast-container']")
	public WebElement succesfullySavedMessage;
	
	@FindBy(xpath = "//a[@id='actionButtons']")
	public WebElement takeDisciplineActionButton;
	
	
	public AddDisciplinaryCaseElements() 
	{
		PageFactory.initElements(driver, this);
	}

}
