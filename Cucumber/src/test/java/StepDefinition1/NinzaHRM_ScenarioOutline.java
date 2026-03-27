package StepDefinition1;


import java.util.HashMap;

import org.hamcrest.Matchers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class NinzaHRM_ScenarioOutline {
  
	Response res;
	static String employeeid;
	@Given("base URL is set for employee")
	public void setBaseUrl() {
		RestAssured.baseURI="http://49.249.28.218:8091";
	}
	
	@When("i send post request with {string} {string} {string} {string} {int} {string} {string} {string} {string}")
	public void sendPostRequest(String designation, String DOB, String email, String empName,
	                           int experience, String mobileNo, String project,
	                           String role, String username) {

	    String body = "{\n" +
	            "  \"designation\": \"" + designation + "\",\n" +
	            "  \"dob\": \"" + DOB + "\",\n" +
	            "  \"email\": \"" + email + "\",\n" +
	            "  \"empName\": \"" + empName + "\",\n" +
	            "  \"experience\": " + experience + ",\n" +
	            "  \"mobileNo\": \"" + mobileNo + "\",\n" +
	            "  \"project\": \"" + project + "\",\n" +
	            "  \"role\": \"" + role + "\",\n" +
	            "  \"username\": \"" + username + "\"\n" +
	            "}";
	
	res=RestAssured.given().contentType(ContentType.JSON).body(body)
			.when().post("/employees");
	
	employeeid=res.jsonPath().getString("employeeId");
	System.out.println(employeeid);
	System.out.println();
}
	 @When("i send GET request with employee id")
	    public void send_get_request() {

	        res = RestAssured.given()
	                .get("/employees/" + employeeid);
	        System.out.println();

	    }
    
	 @When("i send PUT request with {string} {string} {string} {string} {int} {string} {string} {string} {string}")
	 public void send_patch_request(String designation, String DOB, String email, String empName,
             int experience, String mobileNo, String project,
             String role, String username) {
		 

          HashMap<String, Object> map = new HashMap<>();

             map.put("designation", designation); 
             map.put("dob", DOB);
             map.put("email", email);
             map.put("empName", empName +"Updated");
             map.put("experience", experience);
             map.put("mobileNo", mobileNo);
             map.put("project", project);
             map.put("role", role +"Updated");
             map.put("username", username);


	        res = RestAssured.given()
	                .contentType(ContentType.JSON)
	                .body(map)
	                .put("/employee/" + employeeid);
	        System.out.println();

	 }
   @When("i send DELETE request with employee id")
	    public void send_delete_request() {
             System.out.println();
	        res = RestAssured.given().pathParam("empId", employeeid)
	                .delete("/employee/{empId}");
	        System.out.println(res.asPrettyString());

	    }
	
@Then("i validate status code as {int} for employee")	
	public void validate_statusCode(int code) {
	res.then().statusCode(code);
}

@And("verify name of the employee as {string}")
public void verify_employee_name(String empName) {
    res.then().body("employeeName", Matchers.equalTo(empName));
}
	
}
