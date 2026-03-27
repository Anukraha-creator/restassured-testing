package StepDefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class DummyAPI {
	
Response response;
	    int empId;

	    @Given("Base URI is set for Dummy API")
	    public void setBaseURI() {
	        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
	    }

	    // CREATE (POST)
	    @When("I create a new employee with name {string} and salary {string} and age {string}")
	    public void createEmployee(String name, String salary, String age) {

	        String body = "{\n" +
	                "  \"name\": \"" + name + "\",\n" +
	                "  \"salary\": \"" + salary + "\",\n" +
	                "  \"age\": \"" + age + "\"\n" +
	                "}";

	        response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .body(body)
	                .post("/create");

	        System.out.println(response.asString());

	        empId = response.jsonPath().getInt("data.id");
	        System.out.println("Employee ID: " + empId);
	    }

	    // READ (GET)
	    @When("I get employee details")
	    public void getEmployee() {

	        response = RestAssured.given()
	                .get("/employee/" + empId);

	        System.out.println(response.asString());
	    }

	    // UPDATE (PUT)
	    @When("I update employee name to {string}")
	    public void updateEmployee(String newName) {

	        String body = "{\n" +
	                "  \"name\": \"" + newName + "\",\n" +
	                "  \"salary\": \"6000\",\n" +
	                "  \"age\": \"26\"\n" +
	                "}";

	        response = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .body(body)
	                .put("/update/" + empId);

	        System.out.println(response.asString());
	    }

	    // DELETE
	    @When("I delete employee")
	    public void deleteEmployee() {

	        response = RestAssured.given()
	                .delete("/delete/" + empId);

	        System.out.println(response.asString());
	    }

	    // VALIDATION
	    @Then("response status code should be {int}")
	    public void validateStatus(int statusCode) {
	        response.then().statusCode(statusCode);
	    }
	}


