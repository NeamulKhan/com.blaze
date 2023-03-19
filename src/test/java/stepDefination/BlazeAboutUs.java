package stepDefination;

import com.blazePageAction.BlazeAboutUsAction;
import com.blazePageAction.BlazeHomePageAction;

import cucumber.api.java.en.Then;
import utility.Base_Blaze;
import utility.BlazeUtility;

public class BlazeAboutUs extends Base_Blaze {
	
	BlazeAboutUsAction blazeAboutUsAction = new BlazeAboutUsAction();
	BlazeHomePageAction blazeHomePageAction = new BlazeHomePageAction();
	
	@Then("^click about us link$")
	public void click_about_us_link() throws Throwable {
	   
		blazeHomePageAction.clickAboutUsLink();
		
	}

	@Then("^click video button and verify video run$")
	public void click_video_button_and_verify_video_run() throws Throwable {
	    
		blazeAboutUsAction.clickVideoButton();
		BlazeUtility.takeMyScreenshot(driver, "About us");
	}

	@Then("^click close button$")
	public void click_close_button() throws Throwable {
		
		blazeAboutUsAction.clickCloseButton();	
	   
		
	}



}
