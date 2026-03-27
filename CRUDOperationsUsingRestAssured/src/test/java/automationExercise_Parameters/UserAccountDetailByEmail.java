package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UserAccountDetailByEmail {
	@Test
	public void userAccountDetailByEmail() {
		RestAssured.given()
		.formParam("email", "anuakshaya2019@gmail.com")
		
		
		
		
		.when()
		.get("https://automationexercise.com/api/getUserDetailByEmail")
		
		
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
