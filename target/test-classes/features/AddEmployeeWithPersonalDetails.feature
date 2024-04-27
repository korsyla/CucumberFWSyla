#Korab
@AddEmpWithPersonalDetails
Feature: Add Employee with Personal Details

  Background: 
    Given I am logged in with username "Admin" and password "Neotech@123"
    And I clickk on the login button

  Scenario Outline: Add Employee and fill in their personal details
    When I click on the PIM button
    And I click on the Add Employee button
    And I enter Employee firstname "Real", and lastname "Madrid"
    And I select location "Texas R&D"
    And I clock on the save button
    Then I am able to modify "<MaritalStatus>", "<Gender>", "<Nationality>", "<DriverLicsNumber>", "<Smoker>", "<NickName>"
    Then I click on the save button
    Then I validate it is saved successfully

    Examples: 
      | MaritalStatus | Gender | Nationality | DriverLicsNumber | Smoker | NickName |
      | Married       | Male   | Indonesian  | Nr14578          | Yes    | Ayoo     |
     # | Single        | Female | Irish       | Nr38982          | No    | Yooayyy               |
