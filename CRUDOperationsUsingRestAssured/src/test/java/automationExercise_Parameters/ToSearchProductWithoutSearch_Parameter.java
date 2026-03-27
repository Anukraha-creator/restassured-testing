package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ToSearchProductWithoutSearch_Parameter {
	@Test
	public void withoutSearchParameter() {
		RestAssured.given()
		
		
		
		
		
		.when()
		.post("https://automationexercise.com/api/searchProduct")
		
		
		.then()
		.log().all();
	}

}
