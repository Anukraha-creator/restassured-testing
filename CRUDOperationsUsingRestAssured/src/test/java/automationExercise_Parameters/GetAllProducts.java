package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllProducts {
	@Test
	public void getAllProducts() {
		RestAssured.given()
		
		
		
		
		.when()
		.get("https://automationexercise.com/api/productsList")
		
		
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
