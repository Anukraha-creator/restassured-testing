package crudOperations_NinjaHRM;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class AddProject {
	@Test
	public void create() {
	RestAssured.given()
	.contentType(ContentType.JSON)
	.body("{\r\n"
			+ "  \"createdBy\": \"Anu\",\r\n"
			+ "  \"projectName\": \"Anu_Project_05\",\r\n"
			+ "  \"status\": \"OnGoing\",\r\n"
			+ "  \"teamSize\": 0\r\n"
			+ "}")
	
	
	
	.when()
	.post("http://49.249.28.218:8091/addProject")
	
	
	
	.then()
	.statusCode(201)
	.log().all();

}
}
