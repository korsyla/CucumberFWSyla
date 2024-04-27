package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.neotech.utilities.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class DataTableWElion extends CommonMethods {
	
	@When("user enters employee details and clicks on save and validates it is added")
	public void user_enters_employee_details(DataTable dataTable) 
	{
//	    System.out.println(dataTable);
//		asList() -> method returns a List for every ROW (including the header)
//		System.out.println(dataTable.asList());
		
//		This is better using asMaps() ->  {FirstName=nari, MiddleName=A, Lastname=manari},
//		asMaps() -> returns a List of Maps for every data row reading as Key-Value (NOT Including the Header)
		System.out.println(dataTable.asMaps());
		
	//When we have DataTable with Header, We should look to use List OF Map since it reads key-value format *******
		
		 List<Map<String, String>> employeeList = dataTable.asMaps();
		 
		 for(Map<String, String> employee : employeeList) 
		 {
			 System.out.println(employee);
			 
			 String fName = employee.get("FirstName"); 
			 String mName = employee.get("MiddleName");
			 String lName = employee.get("LastName");
			 
			 sendText(addEmployee.firstName, fName);
			 sendText(addEmployee.lastName, lName);
			 sendText(addEmployee.lastName, lName);
			 
			 selectDropdown(addEmployee.locationSelect, "France Regional HQ"); wait(1);
			 
			 click(addEmployee.saveButton);
			 
			 waitForVisability(personalDetails.personalDetailsForm);
			 
			 //VALIDATION
			 String expectedName = fName + " " + lName;
			 String actualName = personalDetails.employeeFullName.getText();
			 
			 Assert.assertEquals("The expected and actual employee full name do NOT match", expectedName, actualName);
			 
			 //When we're done with 1st Employee, before the next iteration, We need to click Add Employee page again
			 //so the next iteration of adding the next employee can happen
			 
			 wait(1);
			 click(dashboard.addEmployeeButton); //We need to click Add Employee page again so the next iteration of adding the next employee can happen
			 
			 
		 }
		 
		 
		
	}

}
