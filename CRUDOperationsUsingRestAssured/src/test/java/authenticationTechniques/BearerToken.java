package authenticationTechniques;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerToken {
	@Test
	public void bearerToken() {
		given()
		.auth().oauth2("1234")
		
		
		
		
		.when()
		.get("https://httpbin.org/bearer")
		
		
		
		.then()
		.log().all();
	}

}
