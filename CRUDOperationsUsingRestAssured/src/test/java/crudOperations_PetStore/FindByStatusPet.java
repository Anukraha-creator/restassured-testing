package crudOperations_PetStore;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class FindByStatusPet {
	@Test
	public void findByStatusPet() {
		RestAssured.given()
		.queryParam("status", "sold")
		
		
		
		.when()
		.get("https://petstore.swagger.io/v2/pet/findByStatus")
		
		
		
		
		.then()
		.log().all();
	}

}
