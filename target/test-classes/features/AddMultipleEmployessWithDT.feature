#Korab
Feature: Add multiple Employess

  Background: 
    Given I am logged in with username "Admin" and password "Neotech@123"
    And I clickk on the login button
    
	@AddMultiEmployeesAtOnce
  Scenario: Adding mutliple Employess at Once
    When I click on the PIM button
    And I click on the Add Employee button
    Then I fill in the new employee details and click save and I validate employee is added sucessfully
      | FirstName | MiddleName | LastName | Location                   |
      | Angli     | Ang        | Lia      | British Development Center |
      | Australi  | Aus        | Tralia   | Australian Regional HQ     |
      | Belgjik   | Bel        | Gjika    | Singapore Regional HQ      |
