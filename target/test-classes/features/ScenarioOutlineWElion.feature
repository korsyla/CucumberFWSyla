#Author: Korab
@AddEmployeeFeatureWElion
Feature: Add Employee Feature
  I want to test the Add Employee Functionality

  # BACKGROUND steps are common to all Scenarios but only in the Feature File it belongs to or included in
  Background: 
    Given user is logged in with valid credentials
    And user navigates to AddEmployee page

	#DDT -> This Scenario will run 3 times cus we have 3 rows in Examples data, so as many times as we have ROWS in Examples

  @AddMultipleEmployees
  Scenario Outline: Adding multiple employees with scenario outline
    When user enters employee "<FirstName>", "<MiddleName>" and "<LastName>"
    And user selects a location "<Location>"
    And user clicks on save button
    Then validate that "<FirstName>" and "<LastName>" is added successfully

    Examples: 
      | FirstName | MiddleName | LastName | Location                         |
      | Joe       | R          | Biden    | New York Sales Office            |
      | Donald    | J          | Trumph   | Chinese Development Center       |
      | Barack    | H          | Obama    | South African Development Center |
