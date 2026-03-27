package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ToVerifyLoginWithValidDetails {
@Test
public void verifyLoginWIthValidDetails() {
	RestAssured.given()
	.formParam("email", "anukraha2004@gmail.com")
	.formParam("password", "Anu@2004")
	
	
	.when()
	.post("https://automationexercise.com/api/verifyLogin")
	
	
	
	.then()
	.log().all();
}
}
