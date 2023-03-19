package stepDefination;

import com.blazePageAction.BlazeAddtoCartAction;
import com.blazePageAction.BlazeCartPageAction;
import com.blazePageAction.BlazeHomePageAction;

import cucumber.api.java.en.Then;
import utility.Base_Blaze;
import utility.BlazeUtility;

public class BlazeCart extends Base_Blaze {
	
	BlazeHomePageAction blazeHomePageAction = new BlazeHomePageAction();
	BlazeAddtoCartAction blazeAddtoCartAction = new BlazeAddtoCartAction();
	BlazeCartPageAction blazeCartPageAction = new BlazeCartPageAction();
	
	
	@Then("^click nexus(\\d+) link$")
	public void click_nexus_link(int arg1) throws Throwable {
		
		blazeHomePageAction.clickNexus6Link();
	   
	}

	@Then("^click add to cart button$")
	public void click_add_to_cart_button() throws Throwable {
	    
		blazeAddtoCartAction.clickAddToCartButton();
		
	}

	@Then("^click cart link$")
	public void click_cart_link() throws Throwable {
		
		blazeAddtoCartAction.clickCartLink();
	    
	}

	@Then("^verify item added in the cart$")
	public void verify_item_added_in_the_cart() throws Throwable {
		
		blazeCartPageAction.verifyItemAdded();
		BlazeUtility.takeMyScreenshot(driver, "Blaze Cart Page");
	    
	}



}
