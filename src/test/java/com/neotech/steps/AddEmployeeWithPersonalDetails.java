package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeWithPersonalDetails extends CommonMethods {
	
	
	@Given("I am logged in with username {string} and password {string}")
	public void i_am_logged_in_with_username_and_password(String username, String password) 
	{
	    sendText(login.username, username); wait(1);
	    sendText(login.password, password); wait(1);
	    
	}
	@Given("I clickk on the login button")
	public void i_clickk_on_the_login_button() 
	{
	    click(login.loginButton); wait(1);
	    
	}
	@When("I click on the PIM button")
	public void i_click_on_the_pim_button() 
	{
	    click(dashboard.pimButton); wait(1);
	    
	}
	@When("I click on the Add Employee button")
	public void i_click_on_the_add_employee_button() 
	{
	    click(dashboard.addEmployeeButton); wait(1);
	}
	@When("I enter Employee firstname {string}, and lastname {string}")
	public void i_enter_employee_firstname_and_lastname(String firstName, String lastName) 
	{
	    waitForVisability(addEmployee.firstName);
	    sendText(addEmployee.firstName, firstName); wait(1);
	    sendText(addEmployee.lastName, lastName); wait(1);
	}
	@When("I select location {string}")
	public void i_select_location(String location) 
	{
	    selectDropdown(addEmployee.locationSelect, location);
	}
	@When("I clock on the save button")
	public void i_clock_on_the_save_button() 
	{
	    click(addEmployee.saveButton); wait(1);
	}
	@Then("I am able to modify {string}, {string}, {string}, {string}, {string}, {string}")
	public void i_am_able_to_modify(String maritalStatus, String gender, String nationality, 
			String driverLicsNumber, String smoker, String NickName) 
	{
	    waitForVisability(personalDetails.personalDetailsForm);
	    click(personalDetails.maritalStatusButton); wait(1);
	    
	    // This is the best way, however im just ignoring just to practice
//	    clickOnDropDownElement(personalDetails.maritalStatusOptions, maritalStatus); wait(1);
	   
	   //This is a the Manual Way of doing it -> maritalStatus
	   List<WebElement> maritalStatusOptions= personalDetails.maritalStatusOptions;
	   
	   for(WebElement maritalStatusOption : maritalStatusOptions) 
	   {
		   if(maritalStatusOption.getText().equals(maritalStatus)) 
		   {
			   click(maritalStatusOption);
			   break;
		   }
	   }
	   
	   //Clicking & getting the gender
	   click(personalDetails.genderInput); wait(1);
	   
	    List<WebElement> genderOptions = personalDetails.genderOptions;
	    
	    for(WebElement genderOption : genderOptions) 
	    {
	    	if(genderOption.getText().equals(gender)) 
	    	{
	    		click(genderOption);
	    		break;
	    	}
	    }
	    
	    
	    //Clicking & getting the nationality
	    click(personalDetails.nationalityInput); wait(1);
	    List<WebElement> nationalityOptions = personalDetails.nationalityOptions;
	    
	    for(WebElement nationalityOption : nationalityOptions ) 
	    {
	    	if(nationalityOption.getText().equals(nationality)) 
	    	{
	    		click(nationalityOption);
	    		break;
	    	}
	    }
	    
	    //Sending the DriverLicense number
	    sendText(personalDetails.driverLicense, driverLicsNumber); wait(1);
	    
	    if(smoker.equals("Yes")) 
	    {
	    	click(personalDetails.smokerCheckBox);
	    }
	   wait(1);
	   
	   sendText(personalDetails.nickNameBox, NickName); wait(1);
	   
	   
	    
	}
	
	@Then("I click on the save button")
	public void i_click_on_the_save_button() 
	{
	    click(personalDetails.personalDetailsSaveButton); wait(1);
	}
	
	@Then("I validate it is saved successfully")
	public void i_validate_it_is_saved_successfully() 
	{
		
	    
		click(personalDetails.personalDetailsSaveButton); wait(1);
	    String expected = "Successfully Updated";
	    String actual = personalDetails.successfullyUpdatedMessage.getText();
	    
	    
	    Assert.assertEquals("Expected and Actual Messages did NOT match", expected, actual);
	}
	
	

}
