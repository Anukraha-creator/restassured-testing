package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StepDefinition_usingBackground {
	Response res;
	static String projectid;
	
	@Given("set the base URL")
	public void setTheBaseURL() {
		RestAssured.baseURI="http://49.249.28.218:8091";
	}
	
	@When("I post the request")
	public void postTheRequest() {
		
String json_body="{\r\n"
		+ "  \"createdBy\": \"abcdexyyyyyy\",\r\n"
		+ "  \"projectName\": \"ab1276\",\r\n"
		+ "  \"status\": \"Completed\",\r\n"
		+ "  \"teamSize\": 0\r\n"
		+ "}";
		
		
		 res=RestAssured.given()
		     .contentType(ContentType.JSON)
		     .body(json_body)
		     .post("/addProject");
		 projectid=res.jsonPath().getString("projectId");
		       
	}
	

	@When("I get the request")
	public void getTheRequest() {
		
		 res=RestAssured.given().pathParam("projectId", projectid)
		    
		     .get("/project/{projectId}");
		       
	}
	
	
	
	@Then("validate the status code as {int}")
	public void validateStatusCode(int StatusCode) {
		res.then().statusCode(StatusCode);
	}
}
