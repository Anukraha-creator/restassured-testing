package StepDefinition1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import POJO.ProjectPojo;
public class StepDef_Ninja_Body_Pojo {


		static String projectId;
		Response response;
		
		//Create
		@Given("Base URL is set for NinzaHRM")
		public void setBaseUrl() {
			RestAssured.baseURI="http://49.249.28.218:8091";
		}
		@When("I send POST request with createdBy {string} projectName {string} status {string} teamSize {int}")
		public void create_Project(String createdBy,String projectName, String status, int teamSize)
		{
			ProjectPojo pojo = new ProjectPojo(createdBy, projectName, status, teamSize);
			response=RestAssured.given().contentType(ContentType.JSON)
					.body(pojo)
					.when().post("/addProject");
			
			  projectId = response.jsonPath().getString("projectId");
		}
		
	//Get
	@When("I send GET request with project id")
	public void get_ProjectByid() {
		response=RestAssured.given().pathParam("projectId", projectId)
				.when().get("/project/{projectId}");
	}

	//Update
	@When("I send PUT request with createdBy {string} projectName {string} status {string} teamSize {int}")
	public void update_Project(String createdBy,String projectName,String status, int teamSize)
	{
		ProjectPojo pojo = new ProjectPojo(createdBy, projectName, status, teamSize);
		response=RestAssured.given().contentType(ContentType.JSON).pathParam("projectId", projectId)
				.body(pojo)
				.when().put("/project/{projectId}");
		
	}

	//delete
	@When("I send DELETE request with id it must delete project")
	public void delete_ProjectByid() {
		response=RestAssured.given().pathParam("projectId", projectId)
				.when().delete("/project/{projectId}");
	}

	//validation 
	 //for post
	@Then("validate status code is 201")
	public void validate_StatusCode_201() {
		response.then().statusCode(201);
	}


	//for get and put 
	@Then("validate status code is 200")
	public void validate_StatusCode_200() {
		response.then().statusCode(200);
	}

	//for delete
	@Then("validate status code is 204")
	public void validate_StatusCode_204() {
		response.then().statusCode(204);
	}











	}



