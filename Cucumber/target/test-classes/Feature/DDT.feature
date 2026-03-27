#author:ANU
Feature: Create Project using Data Driven Testing 

Scenario Outline: Create multiple projects
 
 Given base URL is set for project
 When I send POST request with "<createdBy>" "<projectName>" "<status>" <teamSize>
 Then validate status Code as 201 for project
 
 Examples:

 |createdBy | projectName| status    | teamSize |
 |ANU       | anu_proj1  | OnGoing   |   0      |
 |ANU       | anu_proj2  | Completed |   0      |
 |ANU       | anu_proj3  | OnGoing   |   0      |
 |ANU       | anu_proj4  | Created   |   0      |
 |ANU       | anu_proj5  | OnGoing   |   0      |
