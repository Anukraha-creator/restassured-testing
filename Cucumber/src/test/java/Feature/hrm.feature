#author: Anu

Feature: CRUD Operations on NinzaHRM

Scenario: Create a new Project
Given Base URL is set for NinzaHRM
When I send POST request with createdBy "lily" projectName "lily_project" status "OnGoing" teamSize 0
Then validate status code is 201

Scenario: Get project by their id
Given Base URL is set for NinzaHRM
When I send GET request with project id
Then validate status code is 200


Scenario: Update project by id 
Given Base URL is set for NinzaHRM
When I send PUT request with createdBy "lily" projectName "lily_project_updated" status "Completed" teamSize 0
Then validate status code is 200


Scenario: Delete project by id
Given Base URL is set for NinzaHRM
When I send DELETE request with id it must delete project
Then validate status code is 204