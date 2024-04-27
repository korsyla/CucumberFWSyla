#Author: Korab

@AddEmployeeFeature
Feature: Add Employee Feature
  I want to test the Add Employee Functionality

  # BACKGROUND steps are common to all Scenarios but only in the Feature File it belongs to or included in
  Background: 
    Given user is logged in with valid credentials
    And user navigates to AddEmployee page

  @AddEmployee
  Scenario: Add Employee with first and last name
    When user enters employee first and last name
    And user select a location
    And user clicks on save button
    Then validate that employee is added successfully

  @AddEmployeeParametrized
  Scenario: Add Employee with parametrized first and last name
    When user enters employee first name "Cristiano" and last name "Ronaldo"
    And user select a location
    And user clicks on save button
    Then validate that employee "Cristiano Ronaldo" is added successfully

  @AddEMployeeWithCredentials
  Scenario: Add Employee and create login Credentials
    When user enters employee first name "Ronaldo" and last name "Hazard"
    And user select a location
    And user clicks on Create Login Details
    And user provides credentials
    And user clicks on save button
    Then validate that employee "Ronaldo Hazard" is added successfully
    
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
