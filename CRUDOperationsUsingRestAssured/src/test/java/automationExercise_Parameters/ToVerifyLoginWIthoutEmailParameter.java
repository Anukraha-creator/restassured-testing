package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ToVerifyLoginWIthoutEmailParameter {
	@Test
	public void verifyLoginWithoutEmail() {
		RestAssured.given()
		
		
		
		.when()
		.post("https://automationexercise.com/api/verifyLogin")
		
		
		
		.then()
		.log().all();
	}

}
