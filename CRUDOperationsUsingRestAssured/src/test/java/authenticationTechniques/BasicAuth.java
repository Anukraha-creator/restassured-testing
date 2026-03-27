package authenticationTechniques;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuth {
	@Test
	public void usingBasicAuth() {
		given()
		.pathParam("user", "admin")
		.pathParam("passwd", "password123")
		.auth().basic("admin", "password123")
		.log().all()
		
		.when()
		.get("https://httpbin.org/basic-auth/{user}/{passwd}")
		
		
		.then()
		.log().all();
	}

}
