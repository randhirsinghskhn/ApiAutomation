package APIAutoPKG;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC6_PojoClassComplexData {
	public static void main(String[] args) {
		
		AddressInformationPOJOComplexData address=new AddressInformationPOJOComplexData();
		address.setHouseno("7073");
		address.setLandmark("Near Allahabad Bank");
		address.setSector("22");
		address.setType("Primary Address");
		
		BasicInformationPOJOComplexData basic=new BasicInformationPOJOComplexData();
		basic.setFirstname("Kulwindercomplex");
		basic.setLastname("Singh");
		basic.setAge("32");
		basic.setDesignation("Test Lead");
		basic.setId("kalSinghcomp");
		basic.setAddress(address);;
		
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
