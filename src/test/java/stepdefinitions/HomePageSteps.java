package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;

public class HomePageSteps {
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	 
		DriverFactory.getDriver().get("https://pssodev.us.dell.com/sp/startSSO.ping?PartnerIdpId=Dell.UAT.Dev&TargetResource=https://samltest.id/");
	}

}
