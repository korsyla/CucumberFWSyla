package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineeSteps extends CommonMethods {
	
	//@ScenarioOutlineReal
	
	@When("user enters login information {string} and {string}")
	public void user_enters_login_information_and(String username, String password) 
	{
	    sendText(login.username, username);wait(1);
	    sendText(login.password, password);wait(1);
	    
	}
	
	
	@Then("verify that {string} is showing")
	public void verify_that_is_showing(String expectedAccountName) 
	{
	    waitForVisability(dashboard.accountName);
	    
	    String actualName = dashboard.accountName.getText();
	    
	    Assert.assertEquals("The expected and actual names do NOT match!", expectedAccountName, actualName);
	}
	
	
	//@ScenarioOutlineConsole
	
	
	@When("Login with {string} and {string}")
	public void login_with_and(String username, String password) 
	{
	    System.out.println("Login with " + username + " and " + password);
	}
	
	@When("Click on the login button")
	public void click_on_the_login_button() 
	{
	    System.out.println("Click on the login button");
	}
	
	@Then("validate that {string} is displayed")
	public void validate_that_is_displayed(String username) 
	{
	    System.out.println("Validate that Welcome " + username + " is showing");
	}
	
	@Then("We want to say Bye {string}")
	public void we_want_to_say_bye(String fullname) 
	{
	    System.out.println("Bye bye " +fullname);
	}

}
