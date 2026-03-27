package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ToVerifyLoginWithInvalidCredentials {
	@Test
	public void verifyLoginWithInvalidCredentials() {
		RestAssured.given()
		.formParam("email", "anuaskshaya2019@gmail.com")
		.formParam("password", "Anu@2004")
		
		
		
		.when()
		.post("https://automationexercise.com/api/verifyLogin")
		
		
		.then()
		.log().all();
	}

}
