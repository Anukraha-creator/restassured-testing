Feature:CRUD operations using background
Background:
Given set the base URL


Scenario:post request  
When I post the request 
Then validate the status code as 201

Scenario:get request  
When I get the request 
Then validate the status code as 200


