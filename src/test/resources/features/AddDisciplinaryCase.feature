#Korab
Feature: Disciplinary Case

  Background: 
    Given I am logged in with username "Admin" and password "Neotech@123"
    And I click on the login button

	@DisciplinaryCase
  Scenario: Add a new Disciplinary Case
    When I click on the Discipline button
    And I click on the Disciplinary Cases
    And I click on the Add Disciplinary Case plus button
    And I enter employee name "Brody Alan"
    And I enter the Case Name "Misbehaviour"
    And I enter the Disciplinary Case Description "Brody Allan has mibehaved"
    Then I click the save button and Validate it is saved successfully
