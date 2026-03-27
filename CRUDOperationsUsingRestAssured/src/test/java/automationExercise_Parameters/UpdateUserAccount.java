package automationExercise_Parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateUserAccount {
	@Test
	public void updateUserAccount() {
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
		.formParam("mobile_number","8270150729")
		
		
		
		
		.when()
		.put("https://automationexercise.com/api/updateAccount")
		
		
		
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
