Feature: Dummy API CRUD Operations

Scenario: Perform CRUD operations on employee

  Given Base URI is set for Dummy API

  When I create a new employee with name "John" and salary "5000" and age "25"
  Then response status code should be 200

  When I get employee details
  Then response status code should be 200

  When I update employee name to "John Updated"
  Then response status code should be 200

  When I delete employee
  Then response status code should be 200