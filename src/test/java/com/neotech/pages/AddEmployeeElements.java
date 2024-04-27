package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.CommonMethods;

public class AddEmployeeElements extends CommonMethods {
	
	@FindBy(id = "first-name-box")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='middle-name-box']")
	public WebElement middleName;
	
	@FindBy(id = "last-name-box")
	public WebElement lastName;
	
	@FindBy(id = "location")
	public WebElement locationSelect;
	
	@FindBy(id = "employeeId")
	public WebElement employeeID;
	
	@FindBy(xpath = "//div[@class='custom-control custom-switch']")
	public WebElement loginDetailsButton;
	
	@FindBy(id = "username")
	public WebElement username;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(id = "confirmPassword")
	public WebElement confirmPassword;
	
	@FindBy(id = "modal-save-button")
	public WebElement saveButton;
	
	@FindBy(xpath = "//select[@id='adminRoleId']")
	public WebElement adminRoleSelect;
	
	@FindBy(xpath = "//div[@id='bs-select-5']/ul/li")
	public List<WebElement> adminRoleOptions;
	
	@FindBy(xpath = "//div[@class='custom-control custom-radio  radio-display-horizontal-margin selected-option']")
	public WebElement statusEnabledButton;
	
	@FindBy(xpath = "//input[@id='allRegions']/..")
	public WebElement allRegionsButton;
	
	@FindBy(xpath = "//input[@placeholder='Select Regions']")
	public WebElement selectRegionButton;
	
	@FindBy(xpath = "//ul[@id='dropdown-multyselect']/li")
	public List<WebElement> selectRegionOptions;
	
	@FindBy(xpath = "//input[@id='selectedLocationsOnly_FR']/..")
	public WebElement selectLocationButton;
	
	@FindBy(xpath = "//input[@placeholder='Select Locations']")
	public WebElement locationsButton;
	
	@FindBy(xpath = "//li[@id='19']")
	public WebElement franceRegionalHQ;
	
	
	
	
	
	
	public AddEmployeeElements() 
	{
		PageFactory.initElements(driver, this);
	}

}
