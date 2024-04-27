#Korab Syla
Feature: Create Login Details

  Background: 
    Given user is logged in with valid credentials
    And user navigates to AddEmployee page

	@CreateLoginDetails
  Scenario Outline: Create Login Details while the new Add Employee
    When I click on the Create Login Details
    And I enter the "<UserName>"
    And I click on Enabled for Status
    And I enter "<Password>" and "<ConfirmPassword>"
    And I click on the "<AdminRole>"
    And I click to switch off All Regions Toggle button
    And I select the Region "<Region>"
    And I click to switch on the Select Locations button
    And I select the location "<Location>"
    Then I click Save and validate that the details are saved successfully

    Examples: 
      | UserName | Password   | ConfirmPassword | AdminRole         | Region | Location           |
      | ayoooo   | Ayoooo@123 | Ayoooo@123      | Regional HR Admin | France | France Regional HQ |
      #|          |            |                 |                   |        |                    |
