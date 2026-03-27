package crudOperations_PetStore;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UploadImageOfPet {
	@Test
	public void uploadImageOfPet() {
		RestAssured.given()
		.pathParam("petId", "1")
		.multiPart("additionalMetadata", "additionalmetadata")
		.multiPart("file", "C:\\Users\\hp\\Downloads\\pngtree-cute-dog-cartoon-art-png-image_17191597.png")
		
		
		
		.when()
		.post("https://petstore.swagger.io/v2/pet/{petId}/uploadImage")
		
		
		.then()
		.log().all();
	}

}
