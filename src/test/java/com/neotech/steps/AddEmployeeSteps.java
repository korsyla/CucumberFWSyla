package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.*;

public class AddEmployeeSteps extends CommonMethods {
	
	//Steps from @AddEmployee Feature File
	
	@Given("user navigates to AddEmployee page")
	public void user_navigates_to_add_employee_page() 
	{
	    click(dashboard.pimButton); wait(1);
	    click(dashboard.addEmployeeButton); wait(1);
	}
	
	//Hard Coded Step
	@When("user enters employee first and last name")
	public void user_enters_employee_first_and_last_name() 
	{
//		addEmployee.firstName.sendKeys("zogu"); -> selenium way 
		
	    sendText(addEmployee.firstName, "zoguu");
	    sendText(addEmployee.lastName, "bardhee");
	    
	    
	}
	
	
	@When("user clicks on save button")
	public void user_clicks_on_save_button() 
	{
	    click(addEmployee.saveButton); wait(1);
	}
	
	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() 
	{
	    waitForVisability(personalDetails.personalDetailsForm);
	    
	    //Now we do VALIDATION
	    
	    String expected = "zoguu bardhee";
	    String actual = personalDetails.employeeFullName.getText();
	    
	    Assert.assertEquals("The expected and actual employee full name do NOT match",expected, actual);
	}
	
	//Steps from @AddEmployeeParametrized Feature File
	
	//Parameterized Step -> values with come from feature file "Cristiano" "Ronaldo"
		@When("user enters employee first name {string} and last name {string}")
		public void user_enters_employee_first_name_and_last_name(String firstName, String lastName) 
		{
		    sendText(addEmployee.firstName, firstName); wait(1);
		    sendText(addEmployee.lastName, lastName); wait(1);
		}
		
		@When("user select a location")
		public void user_select_a_location() 
		{
		    selectDropdown(addEmployee.locationSelect, "New York Sales Office"); wait(1);
		}
	
	@Then("validate that employee {string} is added successfully")
	public void validate_that_employee_is_added_successfully(String expectedFullName) 
	{
		
		waitForVisability(personalDetails.personalDetailsForm);
		
		//Now we do VALIDATION -> Then keyword dictates we do validation
		
		// We don't need to do the String expected here because expected result comes automatically from -
		// Parameterized Feature File in "".
		
		
	
		String actual = personalDetails.employeeFullName.getText();
		
		Assert.assertEquals("The expected and actual employee full name do NOT match", expectedFullName, actual);
		
	}
	
	
	//Steps from @AddEMployeeWithCredentials Feature File
	
	@When("user clicks on Create Login Details")
	public void user_clicks_on_create_login_details() 
	{
		jsClick(addEmployee.loginDetailsButton); wait(1);
	}
	
	@When("user provides credentials")
	public void user_provides_credentials() 
	{
	    waitForVisability(addEmployee.username);
	    
	    sendText(addEmployee.username, "rHazard"); wait(1);
	    sendText(addEmployee.password, "rHazard@123"); wait(1);
	    sendText(addEmployee.confirmPassword, "rHazard@123"); wait(1);
	    
	    
	    
	    
	    
	}
	

}
