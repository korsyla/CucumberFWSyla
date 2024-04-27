#Korab
Feature: Add Employee Important details

  Background: 
    Given I am logged in with username "Admin" and password "Neotech@123"
    And I clickk on the login button
    And I click on the PIM button
    And I click on the Add Employee button
    And I enter Employee firstname "Real", and lastname "Madrid"
    And I select location "Texas R&D"
    And I clock on the save button

  @AddEmployeeImportantDetails
  Scenario: Add Important details of newly Added Employee
    When I select Blood Group "B"
    And I select Shirt Size "Medium"
    And I enter Hobbies "Soccer, Jogging, Hiking, Biking"
    Then I click Save and validate infirmation is saved successfully

  @AddEmployeePreferences
  Scenario: Add Preferences details of newly Added Employee
    When I select my Preferences details and clicks on save and validates it is added
      | Food    | AestheticActivites | Sports   |
      | Veg     | Music              | Squash   |
      | Non-Veg | Arts               | Handball |
    
