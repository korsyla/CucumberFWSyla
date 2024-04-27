package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.CommonMethods;

public class DashboardPageElements extends CommonMethods {
	
	//ALL the DASHBOARD WebElements will be @FindBy in this DashboardPage
	
	@FindBy(id = "account-name")
	public WebElement accountName;
	
	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement pimButton;
	
	@FindBy(xpath = "//span[text()='Add Employee']")
	public WebElement addEmployeeButton;
	
	@FindBy(xpath = "//span[text()='Employee List']")
	public WebElement employeeList;
	
	@FindBy(xpath = "//a[@id='user-dropdown']")
	public WebElement accountNameDropDown;
	
	@FindBy(xpath = "//a[@id='logoutLink']")
	public WebElement logoutButton;
	
	@FindBy(xpath = "//li[@id='menu_news_More']/a")
	public WebElement moreButton;
	
	@FindBy(xpath = "//div[@id='menu-content']/ul/li")
	public List<WebElement> menuList;
	
	@FindBy(xpath = "//li[@id='menu_discipline_defaultDisciplinaryView']")
	public WebElement disciplineButton;
	
	@FindBy(id = "menu_discipline_viewDisciplinaryCases")
	public WebElement disciplinaryCasesButton;
	
	
	
	
	//This -> means we are going to use the driver for everything in THIS class, all the WebElements etc
	public DashboardPageElements() 
	{
		PageFactory.initElements(driver, this);
	}
	

}
