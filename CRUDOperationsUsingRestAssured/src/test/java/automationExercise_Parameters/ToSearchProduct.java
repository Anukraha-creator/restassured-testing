package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ToSearchProduct {
	@Test
	public void toSearchProduct() {
		RestAssured.given()
		.formParam("search_product", "top")
		
		
		
		
		.when()
		.post("https://automationexercise.com/api/searchProduct")
		
		
		.then()
		.log().all();
	}

}
