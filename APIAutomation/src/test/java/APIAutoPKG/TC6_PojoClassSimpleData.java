package APIAutoPKG;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC6_PojoClassSimpleData {
	public static void main(String[] args) {
		
			
		BasicInformationPOJOSimpleData basic=new BasicInformationPOJOSimpleData();
		basic.setFirstname("Kulwindercomplex");
		basic.setLastname("Singh");
		basic.setAge("32");
		basic.setDesignation("Test Lead");
		basic.setId("kalSinghcomp");
		
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/APIStudents");
		
		System.out.println("The status code is :");
		System.out.println(res.statusCode());
		System.out.println(res.asString());
	}
}
