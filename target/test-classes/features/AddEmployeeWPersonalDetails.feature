#Korab
Feature: Add Employee With Personal Details

  Background: 
    Given user is logged in with valid credentials
    And user navigates to AddEmployee page

  @ScenarioOutlineAddEmpwPersonalDetails
  Scenario Outline: Add and Modify Employee Details
    When user enters employee first name "<FirstName>" and last name "<LastName>"
    And user select a location
    And user clicks on save button
    Then I am able to modify Employee Details "<DriverLicense>", "<ExpirationDate>", "<Smoker>", "<Gender>", "<Nationality>"
    Then i click on Personal Details Save

    Examples: 
      | FirstName | LastName | DriverLicense | ExpirationDate | Smoker | Gender | Nationality |
      #| Lionel   | Messi    | N751231       | 2024-02-08     | No     | Male   | Argentinian |
      | Angelina  | Jolie    | T1829331      | 2023-05-10     | Yes    | Female | American    |
