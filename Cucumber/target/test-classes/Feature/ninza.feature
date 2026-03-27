#author:Anu

Feature: Employee controller NINZA HRM

Background: 
Given base URL is set for employee

Scenario Outline: To create a employee

When i send post request with "<designation>" "<DOB>" "<email>" "<empName>" <experience> "<mobileNo>" "<project>" "<role>" "<username>"
Then i validate status code as 201 for employee 
And verify name of the employee as "<empName>"


When i send GET request with employee id
Then i validate status code as 200 for employee


When i send PUT request with "<designation>" "<DOB>" "<email>" "<empName>" <experience> "<mobileNo>" "<project>" "<role>" "<username>"
Then i validate status code as 200 for employee

When i send DELETE request with employee id
Then i validate status code as 500 for employee

Examples: 

| designation | DOB        | email             | empName | experience | mobileNo   | project     | role   | username |
| Developer   | 26/07/2004 | aria@gmail.com    | Arun    | 2          | 9876543210 | lily_proj1  | Tester | aria01   |
| Tester      | 27/05/2005 | lily@gmail.com    | Abi     | 3          | 9123456780 | lily_proj2  | QA     | lily02   |
| Manager     | 03/09/1999 | tom@gmail.com     | Tom     | 5          | 9988776655 | lily_proj3  | Lead   | tom03    |
| Developer   | 26/02/2002 | fin@gmail.com     | Sweety  | 2          | 9988776655 | lily_proj4  | Tester | fin04    |
| Tester      | 03/07/2003 | tim@gmail.com     | Giri    | 3          | 9123456780 | lily_proj5  | Lead   | tim05    |