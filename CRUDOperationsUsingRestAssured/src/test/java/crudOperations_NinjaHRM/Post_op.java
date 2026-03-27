package crudOperations_NinjaHRM;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Post_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "  \"createdBy\": \"Anu\",\r\n"
				+ "  \"projectName\": \"NinjaHRM\",\r\n"
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


