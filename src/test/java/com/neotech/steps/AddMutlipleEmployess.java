package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.neotech.utilities.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class AddMutlipleEmployess extends CommonMethods {
	
	@Then("I fill in the new employee details and click save and I validate employee is added sucessfully")
	public void i_fill_in_the_new_employee_details_and_click_save_(DataTable dataTable) 
	{
	    List<Map<String, String>> employeeList = dataTable.asMaps();
	    
	    for(Map<String, String> employee : employeeList) 
	    {
	    	System.out.println("Employee -> " + employee);
	    	
	    	String fName = employee.get("FirstName");
	    	String mName = employee.get("MiddleName");
	    	String lName = employee.get("LastName");
	    	String location = employee.get("Location");
	    	
	    	sendText(addEmployee.firstName, fName); wait(1);
	    	sendText(addEmployee.middleName, mName); wait(1);
	    	sendText(addEmployee.lastName, lName); wait(1);
	    	selectDropdown(addEmployee.locationSelect, location); wait(1);
	    	
	    	click(addEmployee.saveButton); wait(1);
	    	
	    	waitForVisability(personalDetails.personalDetailsForm);
	    	
	    	//Validation PART
	    	String expectedName = fName + " " + lName;
	    	String actualName = personalDetails.employeeFullName.getText();
	    	
	    	Assert.assertEquals("Expected and actual full name do NOT match!", expectedName, actualName);
	    	
	    	//Now that we are done with the 1st Employee Add, We need to click on the Add Employee page again 
	    	//So the Iteration for the next Employee Row can continue
	    	
	    	wait(1);
	    	click(dashboard.addEmployeeButton); 
	    	//Now that we clicked on Add Employee, the next iteration of adding the next employee will happen automatically
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
