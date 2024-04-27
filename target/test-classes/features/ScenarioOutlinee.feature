@ScenarioOutline
Feature: Scenario Outline Examples

  @ScenarioOutlineReal
  Scenario Outline: Login using Scenario Outline and Examples table
    When user enters login information "<username>" and "<password>"
    And I click on the login button
    Then verify that "<employeeName>" is showing

    Examples: 
      | username    | password       | employeeName       |
      | firstname   | Firstname@123  | firstname lastname |
      | lastname123 | Lastname@123   | lastname           |
      | middlename1 | Middlename@123 | middlename         |
      
      
      

  #This Scenario Outline with Examples will run (Open & Close Browser) as many times as there is data in Examples
  # "<username>" -> those placeholders mean that the value will have to come from Examples keyword data
  #This "<username>" (username) in the step has to be exectly the same as the username in Examples data
  #"username" and "password" -> this step will literally read as username and password as string where as
  #"<username>" and "<password>" will read the values of username and password from Examples data table
  #with number/integer we don't need to have the double quotas "<>", just like this <age>
  # or if its being used just single line we can just write like this 10 without ""
  #When Login with "username" and "password" and age <age>
  @ScenarioOutlineConsole
  Scenario Outline: 
    When Login with "username" and "password"
    And Click on the login button
    Then validate that "<username>" is displayed
    And We want to say Bye "<fullname>"

    Examples: 
      | username | password  | fullname      |
      | ayyy     | passa1234 | ayyy lastname |
      | yoooo    | word1234  | yooo lastname |
      | ahhhh    | doeee1234 | ahhh lastname |
