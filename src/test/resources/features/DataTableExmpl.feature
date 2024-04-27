Feature: Scenarios with Databale

  #This DataTable Scenario will run only ONCE!!
  #The step with DataTable will run only once / So, the BROWSER will load only ONCE
  
  
  @DataTableRealTest
  Scenario: Login using DataTable
    When user enters and password and clicks on the login button
      | username    | password       | employeeName         |
      | firstname   | Firstname@123  | firstname lastname   |
      | lastname123 | Lastname@123   | lastname isalast     |
      | middlename1 | Middlename@123 | middlename isamiddle |



  @dataTableNotRealTest
  Scenario: Add Employee with DataTable
    When I login to the HRM
    And I wan to add Employees
      | FirstName | MiddleName    | LastName    |
      | 1stName   | 1ndMiddleName | 1stLastName |
      | 2ndName   | 2ndMiddleName | 2ndLastName |
      | 3rdname   | 3rdMiddleName | 3rdLastName |
    Then I validate employee is added
