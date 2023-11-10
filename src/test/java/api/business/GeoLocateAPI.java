package api.business;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload.GeoLocation;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class GeoLocateAPI {

	static ResourceBundle getURL()
	{
		ResourceBundle routes = ResourceBundle.getBundle("Routes");//load Routes.properties
		return routes;
	}
	
	public static Response findLocation(GeoLocation payload,String apiKey)
	{
		String post_url = getURL().getString("post_url");
		Response response = given()
	    .queryParam("key", apiKey)			
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		.log().all()
		
		.when()
		.post(post_url);
		
		return response;
	}
	
	
	
}
