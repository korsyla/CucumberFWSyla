#Author: Korab
@AddEmployeeFeatureWElion
Feature: Add Employee Feature
  I want to test the Add Employee Functionality

  # BACKGROUND steps are common to all Scenarios but only in the Feature File it belongs to or included in
  Background: 
    Given user is logged in with valid credentials
    And user navigates to AddEmployee page

  #DDT using DataTable / Scenario will run ONLY once / browser will open and close ONLY once
  @UsingDataTable
  Scenario: Adding multiple employees with DataTable
    When user enters employee details and clicks on save and validates it is added
      | FirstName | MiddleName | LastName |
      | nari      | A          | manari   |
      | dari      | C          | patari   |
      | warii     | E          | halari   |
		