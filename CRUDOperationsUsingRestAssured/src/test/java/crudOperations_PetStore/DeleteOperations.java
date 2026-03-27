package crudOperations_PetStore;

import io.restassured.RestAssured;

public class DeleteOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given()
		
		
		
		.when()
		    .delete("https://petstore.swagger.io/v2/pet/1")
		
		
		.then()
		.log().all();

	}

}
