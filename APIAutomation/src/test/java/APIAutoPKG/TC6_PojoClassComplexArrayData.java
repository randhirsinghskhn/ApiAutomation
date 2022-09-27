package APIAutoPKG;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC6_PojoClassComplexArrayData {
	public static void main(String[] args) {
		
		AddressInformationPOJOComplexArrayData[] address=new AddressInformationPOJOComplexArrayData[2];
		address[0]=new AddressInformationPOJOComplexArrayData();
		address[0].setHouseno("7073");
		address[0].setLandmark("Near Allahabad Bank");
		address[0].setSector("22");
		address[0].setType("Primary Address");
		
		address[1]=new AddressInformationPOJOComplexArrayData();
		address[1].setHouseno("7072");
		address[1].setLandmark("Near State Bank");
		address[1].setSector("23");
		address[1].setType("Secondary Address");
		
		
		BasicInformationPOJOComplexArrayData basic=new BasicInformationPOJOComplexArrayData();
		basic.setFirstname("JagmitCompArray");
		basic.setLastname("Singh");
		basic.setAge("34");
		basic.setDesignation("Test Manager");
		basic.setId("JagComArray");
		basic.setAddress(address);
		
		
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
