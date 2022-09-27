package APIAutoPKG;

import static io.restassured.RestAssured.*;




import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TC1_GetRequest {
	public static void main(String[] args) {
		Response rs= 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/SeleniumStudents");
				System.out.println("*********************TC1**********************************");
				System.out.println("response status code is : ");
				System.out.println(rs.statusCode());
				System.out.println("response data is:");
				System.out.println(rs.asString());
	}
		
	}

