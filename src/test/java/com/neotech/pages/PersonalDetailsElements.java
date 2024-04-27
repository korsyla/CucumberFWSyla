package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.CommonMethods;

public class PersonalDetailsElements extends CommonMethods {
	
	@FindBy(id = "employeeId")
	public WebElement employeeID;
	
	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;
	
	@FindBy(xpath = "//span[@id='pim.navbar.employeeName']")
	public WebElement employeeFullName;
	
	@FindBy(xpath = "//input[@id='licenseNo']")
	public WebElement driverLicense;
	
	@FindBy(xpath = "//label[text()='Smoker']")
	public WebElement smokerCheckBox;
	
	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']//input[@class='select-dropdown']")
	public WebElement genderInput;
	
	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/ul/li")
	public List<WebElement> genderOptions;
	
	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']//input")
	public WebElement nationalityInput;
	
	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']//li//span")
	public List<WebElement> nationalityOptions;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/parent::div//i")
	public WebElement licenseExpDateCalendar;
	
	//Date param: 2024-02-08 
	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']/input")
	public WebElement licsExpYearInput;
	
	@FindBy(xpath = "//div[@class='select-wrapper picker__select--year']/ul/li")
	public List<WebElement> licsExpYearsOptions;
	
	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']/input")
	public WebElement licsExpMonthInput;
	
	@FindBy(xpath = "//div[@class='select-wrapper picker__select--month']/ul/li")
	public List<WebElement> licsExpMonthsOptions;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/..//tbody/tr/td")
	public List<WebElement> licsExpDaysOptions;
	
	@FindBy(xpath = "//*[@id='pimPersonalDetailsForm']//button[@type='submit']")
	public WebElement personalDetailsSaveButton;
	
	@FindBy(xpath = "//div[@id='emp_marital_status_inputfileddiv']/descendant::input")
	public WebElement maritalStatusButton;
	
	@FindBy(xpath = "//div[@id='emp_marital_status_inputfileddiv']/div/ul/li")
	public List<WebElement> maritalStatusOptions;
	
	@FindBy(xpath = "//input[@id='emp_birthday']/../span/span/i")
	public WebElement dateOfBirthButton;
	
	@FindBy(xpath = "//input[@id='nickName']")
	public WebElement nickNameBox;
	
	@FindBy(xpath = "//div[@id='toast-container']")
	public WebElement successfullyUpdatedMessage;
	
	@FindBy(xpath = "//div[@id='1_inputfileddiv']/div/input")
	public WebElement BloodGroupSelectButton;
	
	@FindBy(xpath = "//div[@id='1_inputfileddiv']/div//li")
	public List<WebElement> BloodGroupSelectOptions;
	
	@FindBy(xpath = "//input[@id='5']")
	public WebElement hobbiesTextbox;
	
	@FindBy(xpath = "//div[@id='19_inputfileddiv']//input")
	public WebElement shirtSizeSelectButton;
	
	@FindBy(xpath = "//div[@id='19_inputfileddiv']//ul/li")
	public List<WebElement> shirtSizeSelectOptions;
	
	@FindBy(xpath = "//form[@name='customFieldsForm_0']//button")
	public WebElement importantSaveButton;
	
	@FindBy(xpath = "//ul[@class='radiobutton-container']/li/label")
	public List<WebElement> foodOptios;
	
	@FindBy(xpath = "//label[text()='Aesthetic activities']/../div/label")
	public List<WebElement> aestheticActivitesOptions;
	
	@FindBy(xpath = "//label[text()='Sports']/../div/label")
	public List<WebElement> sportsOptions;
	
	@FindBy(xpath = "//form[@name='customFieldsForm_1']//button[@type='submit']")
	public WebElement preferencesSaveButton;
	
	
	
	public PersonalDetailsElements() 
	{
		PageFactory.initElements(driver, this);
	}

}
