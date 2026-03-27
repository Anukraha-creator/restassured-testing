package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteUserAccount {
	@Test
	public void deleteUserAccount() {
		RestAssured.given()
		.formParam("email", "anuakshaya2019@gmail.com")
		.formParam("password", "Anu@2004")
		
		
		
		
		
		.when()
		.delete("https://automationexercise.com/api/deleteAccount")
		
		
		
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
