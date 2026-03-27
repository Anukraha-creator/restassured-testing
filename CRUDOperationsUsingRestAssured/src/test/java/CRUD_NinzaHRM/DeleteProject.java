package CRUD_NinzaHRM;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
public class DeleteProject {
	

@Test
	public void deleteProject() {

	    RestAssured.given()

	    .when()
	    .delete("http://49.249.28.218:8091/project/NH_PROJ_1942")

	    .then()
	    .assertThat()
	    .statusCode(204)
	    .log().all();
	}
	}


