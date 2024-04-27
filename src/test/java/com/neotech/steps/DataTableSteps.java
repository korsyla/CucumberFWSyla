package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.neotech.utilities.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataTableSteps extends CommonMethods {
	
	//@DataTableRealTest
	//When we have DataTable with Header, We should look to use List OF Map since it reads key-value format ******* 
	
	@When("user enters and password and clicks on the login button")
	public void user_enters_and_password_and_clicks_on_the_login_button(DataTable dataTable) 
	{
		
		//When we have DataTable with Header, We should look to use List OF Map since it reads key-value format *******
		
	    // STEPS To Do
		//For every row of the DataTable
		//send login credentials
		//click login button
		//verify/Do Validation
		//logout -> This STEP is a MUST!! to send us back so the iteration can start all over again from beginning
		
		//1st We need to get the Data in a List of Maps
		List<Map<String, String>> listOfMaps  = dataTable.asMaps();
		
		for(Map<String, String> map : listOfMaps) 
		{
//			System.out.println("Testing: " + map.get("username") + " : " + map.get("password"));
			
			//Lets login
			
			String username = map.get("username");
			String password = map.get("password");
			String employeeName = map.get("employeeName");
			
			sendText(login.username, username); wait(1);
			sendText(login.password, password); wait(1);
			click(login.loginButton); wait(1);
			
			waitForVisability(dashboard.accountName); wait(1);
			
			String actualAccountName = dashboard.accountName.getText();
			
			Assert.assertEquals("Account names do NOT match!!!", employeeName, actualAccountName);
			
			//logout -> This STEP is a MUST!! to send us back so the iteration can start all over again from beginning
			
			click(dashboard.accountNameDropDown);wait(1);
			click(dashboard.logoutButton); wait(1);
			waitForVisability(login.username);
			
		}
		
	}
	
	
	
	//@dataTableNotRealTest
	
	@When("I login to the HRM")
	public void i_login_to_the_hrm() 
	{
	    System.out.println("Login");
	}
	
	@When("I wan to add Employees")
	public void i_wan_to_add_employees(io.cucumber.datatable.DataTable dataTable) 
	{

		//Getting data from the incoming DataTable
		List<Map<String, String>> listOfMap = dataTable.asMaps();
		
		for(Map<String, String> map : listOfMap) 
		{
			System.out.println(map);
			System.out.println("-----------------------");
			
			System.out.println("First name: " + map.get("FirstName"));
			System.out.println("Middle name: " + map.get("MiddleName"));
			System.out.println("Last name: " + map.get("LastName"));
			
		}
		
	}
	
	@Then("I validate employee is added")
	public void i_validate_employee_is_added() 
	{
	    System.out.println("Validate Employee Added");
	}

}
