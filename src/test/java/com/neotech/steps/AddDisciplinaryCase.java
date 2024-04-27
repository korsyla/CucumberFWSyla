package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDisciplinaryCase extends CommonMethods {
	
	@When("I click on the Discipline button")
	public void i_click_on_the_discipline_button() 
	{
		click(dashboard.disciplineButton); wait(1);
	    
	}
	
	@When("I click on the Disciplinary Cases")
	public void i_click_on_the_disciplinary_cases() 
	{
	    click(dashboard.disciplinaryCasesButton); wait(1);
	}
	
	@When("I click on the Add Disciplinary Case plus button")
	public void i_click_on_the_add_disciplinary_case_plus_button() 
	{
	    switchToFrame(disciplinaryCase.iFrameDisciplinaryCases);
	    waitForClickability(disciplinaryCase.disciplinaryCasePlusButton);
	    click(disciplinaryCase.disciplinaryCasePlusButton);
	}
	
	@When("I enter employee name {string}")
	public void i_enter_employee_name(String emplFullName) 
	{
	    sendText(addDisciplinaryCase.employeeNameInput, emplFullName); wait(1);
	    click(addDisciplinaryCase.employeeNameButton); wait(1);
	    
	}
	
	@When("I enter the Case Name {string}")
	public void i_enter_the_case_name(String caseName) 
	{
	    sendText(addDisciplinaryCase.caseNameInput, caseName); wait(1);
	}
	
	@When("I enter the Disciplinary Case Description {string}")
	public void i_enter_the_description(String disciplinaryCaseDescription) 
	{
	    sendText(addDisciplinaryCase.descriptioninput, disciplinaryCaseDescription); wait(1);
	}
	
	@Then("I click the save button and Validate it is saved successfully")
	public void i_click_the_save_button_and_validate_it_is_saved_successfully() 
	{
	    click(addDisciplinaryCase.saveButton);
	    waitForVisability(addDisciplinaryCase.succesfullySavedMessage);
	    
	    String expected = "Successfully Saved";
	    String actual = addDisciplinaryCase.succesfullySavedMessage.getText();
	    
	    Assert.assertEquals("The Expected and Actual Message do NOT match!!! ", expected, actual);
	    
	    
	    
	}

}
