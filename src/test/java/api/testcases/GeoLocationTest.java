package api.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.business.GeoLocateAPI;
import api.common.NetworkType;
import api.payload.GeoLocation;
import io.restassured.response.Response;

public class GeoLocationTest {

	Faker faker;
	GeoLocation geoLocationPayLoad;
	public static Logger logger;

	@BeforeClass
	public void generateTestData()
	{
		faker = new Faker();
		geoLocationPayLoad = new GeoLocation();

		geoLocationPayLoad.setHomeMobileCountryCode(faker.number().numberBetween(0, 999));
		geoLocationPayLoad.setHomeMobileNetworkCode(faker.number().numberBetween(0, 32767));
		geoLocationPayLoad.setRadioType(NetworkType.getRandomNetworkType());
		geoLocationPayLoad.setCarrier("Vodafone");
		geoLocationPayLoad.setConsiderIp(true);
		logger = LogManager.getLogger("RestAssuredAutomationFramework_test");
	}

	@Test(priority=1)
	public void testCreateUser()
	{
		Response response = GeoLocateAPI.findLocation(geoLocationPayLoad,"AIzaSyA1JVVgQQpG97pz452N5nJsfOq6U41eifY");

		response.then().log().all();


		//validation
		Assert.assertEquals(response.getStatusCode(),200);

		//log
		logger.info("Location Fetched.");
	}


	
}
