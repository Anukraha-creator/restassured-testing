Feature: PetStore CRUD Operations

Scenario: Pet CRUD operations

  Given Base URI is set

  When I send post request with name "Max"
  Then response code must be 200

  When I send GET request with petId
  Then response code must be 200

  When I send PUT request to update pet
  Then response code must be 200

  When I send DELETE request with petId
  Then response code must be 200