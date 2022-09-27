package APIAutoPKG;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC4_PostRequestOrgJSONComplex {
	public static void main(String[] args) {
		JSONObject inner=new JSONObject();
		inner.put("Ward No. ", "5");
		inner.put("Landmark", "Allahabad Bank");
		inner.put("Road", "Malout Road");
		inner.put("House No.", "7073");
		
		JSONObject outer=new JSONObject();
		outer.put("firstname", "Baljinder");
		outer.put("lastname", "Singh");
		outer.put("Designation", "Team Lead");
		outer.put("ID", "fdsj23");
		outer.put("Address", inner);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.when()
		.post("http://localhost:3000/APIStudents");
		System.out.println("Response code is: ");
		System.out.println(res.statusCode());
	}
}
