@Background
Feature: Background Example

Background: 
	Given Precondition1  
	And Precondition2
	

	Scenario: Example1
		When Test nr1 firstName is "Emre" and lastName is "Cinar" and age is 30
		And Test nr2
		And test nr3
		Then Validation nr1 
		And Validation nr2
		
		
		
	Scenario:	Example2
		When Test nr4 
		And Test nr5
		And test nr6
		Then Validation nr3 
		And Validation nr4
		
		
		#----------------------
		#Hooks are executed for every scenario in every feature file 
		#Background steps are only executed for the feature file it belongs to 