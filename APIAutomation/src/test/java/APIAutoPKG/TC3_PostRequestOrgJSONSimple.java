package APIAutoPKG;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC3_PostRequestOrgJSONSimple {
	public static void main(String[] args)
	{
		JSONObject outer=new JSONObject();
		outer.put("firstname", "Hardeep");
		outer.put("lastname", "Kaur");
		outer.put("Designation", "Assistant Manager");
		outer.put("ID", "fdsj56");
		
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
