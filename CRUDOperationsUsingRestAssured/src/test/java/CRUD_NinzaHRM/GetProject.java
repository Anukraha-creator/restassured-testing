package CRUD_NinzaHRM;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class GetProject {
	
	@Test
	public void getProjects() {

	    RestAssured.given()

	    .when()
	    .get("http://49.249.28.218:8091/projects")

	    .then()
	    .assertThat()
	    .statusCode(200)
	    .log().all();
	}
	}


