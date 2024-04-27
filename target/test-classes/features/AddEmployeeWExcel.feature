
Feature: Add Employee using Excel

Background: 
    Given user is logged in with valid credentials
    And user navigates to AddEmployee page
    
	@AddEmployeeUsingExcel
	Scenario: Add multiple employees from Excel
	When user enters employee data from "Employee" excel sheet then save