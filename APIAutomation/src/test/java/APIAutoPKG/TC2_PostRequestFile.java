package APIAutoPKG;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC2_PostRequestFile {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		File f=new File("../APIAutomation/BodyData.json");
		FileReader fr=new FileReader(f);
		JSONTokener jr=new JSONTokener(fr);
		JSONObject ob=new JSONObject(jr);	
		
		Response rs=
		given()
		.contentType(ContentType.JSON)
		.body(ob.toString())
		.when()
		.post("http://localhost:3000/APIStudents");
		
		System.out.println("Status code is: ");
		System.out.println(rs.statusCode());
	}
	
}
