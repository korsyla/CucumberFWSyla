Feature: Dashboard Menu

  @DataTableWNoHeader @regression
  Scenario: Dashboard menu for Admin
    Given user is logged in with valid credentials
    Then I want to validate the item in the menu
      | Admin           |
      | PIM             |
      | My Info         |
      | Discipline      |
      | Reports Catalog |
      | More            |
      | Maintenance     |
