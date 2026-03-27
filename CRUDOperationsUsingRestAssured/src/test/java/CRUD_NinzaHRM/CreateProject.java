package CRUD_NinzaHRM;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojoClasses_NinzaHRM.pojoClass_ReqBody;

public class CreateProject {

	@Test
	public void createProject() {

	    pojoClass_ReqBody pj = new pojoClass_ReqBody("Anu", "RestAssuredProject2", "Created", 0);

	    RestAssured.given()
	    .contentType(ContentType.JSON)
	    .body(pj)

	    .when()
	    .post("http://49.249.28.218:8091/addProject")

	    .then()
	    .assertThat()
	    .statusCode(201)
	    .log().all();
	}
	}


