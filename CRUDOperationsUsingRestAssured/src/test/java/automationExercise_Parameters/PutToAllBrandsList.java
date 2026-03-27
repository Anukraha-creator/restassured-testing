package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutToAllBrandsList {
	@Test
	public void putToAllbrandsList() {
		RestAssured.given()
		
		
		
		.when()
		.put("https://automationexercise.com/api/brandsList")
		
		
		.then()
		.log().all();
	}

}
