package APIAutoPKG;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC5_PostRequestORGJSONArray {
	public static void main(String[] args) {
		JSONObject inner1=new JSONObject();
		inner1.put("Ward No. ", "5");
		inner1.put("Landmark", "Allahabad Bank");
		inner1.put("Road", "Malout Road");
		inner1.put("House No.", "7073");
		inner1.put("type", "Primary address");
		
		JSONObject inner2=new JSONObject();
		inner2.put("Ward No. ", "15");
		inner2.put("Landmark", "State Bank of India");
		inner2.put("Road", "Malout Road");
		inner2.put("House No.", "7072");
		inner2.put("type", "Secondary address");
		
		JSONArray outerarray=new JSONArray();
		outerarray.put(0,inner1);
		outerarray.put(1, inner2);
		
		JSONObject outer=new JSONObject();
		outer.put("firstname", "Rashpal");
		outer.put("lastname", "kaur");
		outer.put("Designation", "Developer");
		outer.put("id", "fdsj24");
		outer.put("Address", outerarray);
		
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
