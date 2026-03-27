package crudOperations_PetStore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given()
		        .contentType(ContentType.JSON)
		        .body("{\r\n"
		        		+ "  \"id\": 0,\r\n"
		        		+ "  \"category\": {\r\n"
		        		+ "    \"id\": 0,\r\n"
		        		+ "    \"name\": \"string\"\r\n"
		        		+ "  },\r\n"
		        		+ "  \"name\": \"doggie\",\r\n"
		        		+ "  \"photoUrls\": [\r\n"
		        		+ "    \"string\"\r\n"
		        		+ "  ],\r\n"
		        		+ "  \"tags\": [\r\n"
		        		+ "    {\r\n"
		        		+ "      \"id\": 0,\r\n"
		        		+ "      \"name\": \"string\"\r\n"
		        		+ "    }\r\n"
		        		+ "  ],\r\n"
		        		+ "  \"status\": \"available\"\r\n"
		        		+ "}")
		        		
		        	
		.when()
              .post("https://petstore.swagger.io/v2/pet")
              
              
        .then()
             //.statusCode(200)
             .log().all();
	}

}
