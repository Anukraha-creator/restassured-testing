package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteToVerifyLogin {
	@Test
	public void deleteLogin() {
		RestAssured.given()
		
		
		
		
		.when()
		.delete("https://automationexercise.com/api/verifyLogin")
		
		
		.then()
		.log().all();
	}

}
