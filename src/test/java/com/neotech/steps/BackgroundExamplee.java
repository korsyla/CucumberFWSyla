package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundExamplee {
	
	@Given("Precondition1")
	public void precondition1() 
	{
	    System.out.println("Running precondition1");
	}
	
	@Given("Precondition2")
	public void precondition2() 
	{
		System.out.println("Running precondition2");
	}
	
	@When("Test nr1")
	public void test_nr1() 
	{
		System.out.println("Running test1");
	}
	
	@When("Test nr1 firstName is {string} and lastName is {string}")
	public void test_nr1_first_name_is_and_last_name_is(String firstName, String lastName) 
	{
	    System.out.println("Running test nr1 with firstName: " + firstName + " and lastName: " + lastName);
	}
	
	@When("Test nr2")
	public void test_nr2() 
	{
		System.out.println("Running test2");
	}
	
	@When("test nr3")
	public void test_nr3() 
	{
		System.out.println("Running test3");
	}
	
	@Then("Validation nr1")
	public void validation_nr1() 
	{
		System.out.println("Running Validation1");
	}
	
	@Then("Validation nr2")
	public void validation_nr2() 
	{
		System.out.println("Running Validation2");
	}
	
	@When("Test nr4")
	public void test_nr4() 
	{
		System.out.println("Running test4");
	}
	
	@When("Test nr5")
	public void test_nr5() 
	{
		System.out.println("Running test5");
	}
	
	@When("test nr6")
	public void test_nr6() 
	{
		System.out.println("Running test6");
	}
	
	@Then("Validation nr3")
	public void validation_nr3() 
	{
		System.out.println("Running Validation3");
	}
	
	@Then("Validation nr4")
	public void validation_nr4() 
	{
		System.out.println("Running Validation4");
	}
	

}
