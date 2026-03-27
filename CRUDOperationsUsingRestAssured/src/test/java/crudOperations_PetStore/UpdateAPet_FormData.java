package crudOperations_PetStore;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateAPet_FormData {
	@Test
	public void updateAPet() {
		RestAssured.given()
		.pathParam("petId", "1711")
		.formParam("name", "Rosy")
		.formParam("status", "available")
		
		
		
		
		
		.when()
		.post("https://petstore.swagger.io/v2/pet/{petId}")
		
		
		.then()
		.log().all();
	}

}
