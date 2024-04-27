package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeCreateLoginDetails extends CommonMethods {
	
	@When("I click on the Create Login Details")
	public void i_click_on_the_create_login_details() 
	{
		sendText(addEmployee.firstName, "aaayyyyyyy");
		sendText(addEmployee.lastName, "aayooooooo");
		selectDropdown(addEmployee.locationSelect, "France Regional HQ"); wait(1);
		waitForClickability(addEmployee.loginDetailsButton);
	    click(addEmployee.loginDetailsButton); wait(1);
	}
	
	@When("I enter the {string}")
	public void i_enter_the(String userName) 
	{
	    sendText(addEmployee.username, userName); wait(1);
	}
	
	@When("I click on Enabled for Status")
	public void i_click_on_enabled_for_status() 
	{
	    click(addEmployee.statusEnabledButton); 
	}
	
	@When("I enter {string} and {string}")
	public void i_enter_and(String password, String confirmPassword) 
	{
	    sendText(addEmployee.password, password); wait(1);
	    sendText(addEmployee.confirmPassword, confirmPassword); wait(1);
	}
	
	@When("I click on the {string}")
	public void i_click_on_the(String adminRole) 
	{
	    selectDropdown(addEmployee.adminRoleSelect, adminRole); wait(1);
	}
	
	@When("I click to switch off All Regions Toggle button")
	public void i_click_to_switch_off_all_regions_toggle_button() 
	{
	    click(addEmployee.allRegionsButton); wait(1);
	}
	
	@When("I select the Region {string}")
	public void i_select_the_region(String region) 
	{
		click(addEmployee.selectRegionButton); wait(1);
		
		// This is the best way, however im just ignoring just to practice
//	    clickOnDropDownElement(addEmployee.selectRegionOptions, region); wait(1);
		
		//This is a the Manual Way of doing it -> maritalStatus
	    List<WebElement> selectRegionOptions = addEmployee.selectRegionOptions;
	    
	    for(WebElement selectRegionOption : selectRegionOptions) 
	    {
	    	if(selectRegionOption.getText().equals(region)) 
	    	{
	    		click(selectRegionOption);
	    		break;
	    	}
	    }
	}
	
	@When("I click to switch on the Select Locations button")
	public void i_click_to_switch_on_the_select_locations_button() 
	{
	    click(addEmployee.selectLocationButton); wait(1);
	}
	
	@When("I select the location {string}")
	public void i_select_the_location(String location) 
	{
		click(addEmployee.locationsButton); wait(1);
	    click(addEmployee.franceRegionalHQ); wait(1);
	}
	
	@Then("I click Save and validate that the details are saved successfully")
	public void i_click_save_and_validate_that_the_details_are_saved_successfully() 
	{
	    click(addEmployee.saveButton);
	    waitForVisability(personalDetails.employeeFullName);
	    
	    String expected = "aaayyyyyyy aayooooooo";
	    String actual = personalDetails.employeeFullName.getText();
	    
	    Assert.assertEquals("The expected and actual names did NOT match!!!", expected, actual);
	}

}
