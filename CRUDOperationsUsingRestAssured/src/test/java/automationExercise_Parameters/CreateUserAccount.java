package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateUserAccount {
	@Test
	public void createUserAccount() {
		RestAssured.given()
		.formParam("name","Anukraha")
		.formParam("email","anuakshaya2019@gmail.com")
		.formParam("password","Anu@2004")
		.formParam("title", "Miss")
		.formParam("birth_date","06")
		.formParam("birth_month","December")
		.formParam("birth_year","2004")
		.formParam("firstname","Anukraha")
		.formParam("lastname","T V")
		.formParam("company","Capgemini")
		.formParam("address1","Krishna nagar")
		.formParam("address2","Selva nagar")
		.formParam("country","India")
		.formParam("zipcode","606604")
		.formParam("state","Tamil nadu")
		.formParam("city","Tiruvannamalai")
		.formParam("mobile_number","9943781469")
		
		
		
		
		.when()
		.post("https://automationexercise.com/api/createAccount")
		
		
		
		.then()
		.statusCode(200)
		.log().all();
		
	}

}
