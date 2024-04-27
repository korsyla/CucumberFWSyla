@Login
Feature: Login Functionality

	@smoke
	Scenario: Valid Login
		When I enter a valid username
		And I enter a valid password 
		And I click on the login button
		Then I validate that I am logged in  

		
		
	@regression
	Scenario: Invalid Password
		When I enter a valid username
		And I enter an invalid password
		And I click on the login button
		Then I validate that Invalid Credentials is displayed 
	