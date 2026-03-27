package crudOperations_NinjaHRM;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
public class GetProject {
	@Test
	public void getProject() {
		
			RestAssured.given()
			.when().get("http://49.249.28.218:8091/project/NH_PROJ_1939")
			.then().statusCode(200).log().all();
			
		}
		
	}


