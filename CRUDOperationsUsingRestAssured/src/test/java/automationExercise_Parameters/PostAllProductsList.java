package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostAllProductsList {
	@Test
	public void postAllProductsList() {
		RestAssured.given()
		
		
		
		
		.when()
		.post("https://automationexercise.com/api/productsList")
		
		
		
		.then()
		.log().all();
	}

}
