#Korab
Feature: Dashboard Menu
	
	@DashboardDataTbleNoHeader
  Scenario: Dashboard Menu for Admin
    Given I the user is logged in with credentials
    Then I wan to validate the items in the menu
      | Admin           |
      | PIM             |
      | My Info         |
      | Discipline      |
      | Reports Catalog |
      | More            |
      | Maintenance     |
