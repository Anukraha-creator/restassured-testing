package crudOperations_NinjaHRM;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateProject {
	@Test

public void updateProject() {

RestAssured.given()
.contentType(ContentType.JSON)
.body("{\n"
        + "\"createdBy\":\"Anu\",\n"
        + "\"projectName\":\"Anukraha_Project_005\",\n"
        + "\"status\":\"Completed\",\n"
        + "\"teamSize\":0\n"
        + "}")

.when()
.put("http://49.249.28.218:8091/project/NH_PROJ_1939")

.then()
.statusCode(200)
.log().all();

}
}