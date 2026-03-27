package crudOperations_NinjaHRM;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteProject {
	@Test
	public void deleteProject() {
		
			RestAssured.given()
			.when().delete("http://49.249.28.218:8091/project/NH_PROJ_3196")
			.then().statusCode(204).log().all();
		}
	}

