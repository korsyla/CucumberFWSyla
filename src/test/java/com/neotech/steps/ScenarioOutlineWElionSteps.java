package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineWElionSteps extends CommonMethods {
	
	@When("user enters employee {string}, {string} and {string}")
	public void user_enters_employee_and(String firstName, String middleName, String lastName) 
	{
	    sendText(addEmployee.firstName, firstName); wait(1);
	    sendText(addEmployee.middleName, middleName); wait(1);
	    sendText(addEmployee.lastName, lastName); wait(1);
	    
	    
	}
	
	@When("user selects a location {string}")
	public void user_selects_a_location(String location) 
	{
	    selectDropdown(addEmployee.locationSelect, location); wait(1);
	}
	
//	@When("user clicks on save button")
//	public void user_clicks_on_save_button() 
//	{
//	    click(addEmployee.saveButton); wait(1);
//	}
	
	@Then("validate that {string} and {string} is added successfully")
	public void validate_that_and_is_added_successfully(String firstName, String lastName) 
	{
	    waitForVisability(personalDetails.personalDetailsForm);
	    
	    String expected = firstName + " " + lastName; 
	    String actual = personalDetails.employeeFullName.getText() ;
	    
	    Assert.assertEquals("The expected and actual employee full name do NOT match", expected, actual);
	}

}
