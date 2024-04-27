package com.neotech.steps;

import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmployeeSteps extends CommonMethods {
	
	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() 
	{
//		login.userLogin();
	    sendText(login.username, ConfigsReader.getProperty("username"));
	    sendText(login.password, ConfigsReader.getProperty("password"));
	    click(login.loginButton);
	}
	@Given("user navigates to employee list page")
	public void user_navigates_to_employee_list_page() 
	{
	    click(dashboard.pimButton);
	    click(dashboard.employeeList);
	}
	
	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() 
	{
	   sendText(employeeList.searchBox, "1000");
	   wait(3);
	   
	}
	@When("click on search button")
	public void clicks_on_search_button() 
	{
		click(employeeList.searchButton);
	}
	@Then("employee information is displayed")
	public void employee_information_is_displayed() 
	{
	    System.out.println("Yes I see it!");
	}
	
	@When("user enters valid employee first and last name")
	public void user_enters_valid_employee_first_and_last_name() 
	{
		sendText(employeeList.searchBox, "Brody Alan");
	}

}
