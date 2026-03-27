package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class DDT {
	
Response res;
		
		
		@Given("base URL is set for project")
		public void setURL() {
			RestAssured.baseURI="http://49.249.28.218:8091";
		}
		
		@When("I send POST request with {string} {string} {string} {int}")
		public void post_request(String createdBy,String projectName,String status,int teamSize) {
			String body="{\n" +
		            "\"createdBy\": \"" + createdBy + "\",\n" +
		            "\"projectName\": \"" + projectName + "\",\n" +
		            "\"status\": \"" + status + "\",\n" +
		            "\"teamSize\": " + teamSize + "\n" +
		            "}";
			
			res=RestAssured.given()
					.contentType(ContentType.JSON).body(body)
					.when().post("/addProject");
			
			
			
		}
		
		@Then("validate status Code as 201 for project")
		public void validate_statusCode() {
			res.then().statusCode(201);
		}
		
	}


