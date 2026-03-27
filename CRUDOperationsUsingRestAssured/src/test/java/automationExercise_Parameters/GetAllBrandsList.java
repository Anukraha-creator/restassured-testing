package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllBrandsList {
	@Test
	public void getAllBrandsList() {
		RestAssured.given()
		
		
		
		.when()
		.get("https://automationexercise.com/api/brandsList")
		
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
