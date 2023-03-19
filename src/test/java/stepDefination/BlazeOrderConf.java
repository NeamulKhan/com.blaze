package stepDefination;

import com.blazePageAction.BlazeAddtoCartAction;
import com.blazePageAction.BlazeCartPageAction;
import com.blazePageAction.BlazeHomePageAction;
import com.blazePageAction.OrderPlaceAction;

import cucumber.api.java.en.Then;
import utility.Base_Blaze;
import utility.BlazeUtility;

public class BlazeOrderConf extends Base_Blaze{
	
	BlazeHomePageAction blazeHomePageAction = new BlazeHomePageAction();
	BlazeAddtoCartAction blazeAddtoCartAction = new BlazeAddtoCartAction();
	BlazeCartPageAction blazeCartPageAction = new BlazeCartPageAction();
	OrderPlaceAction orderPlaceAction = new OrderPlaceAction();
	
		
@Then("^click Nexus(\\d+) link$")
public void click_Nexus_link(int arg1) throws Throwable {
   
	blazeHomePageAction.clickNexus6Link();
}

@Then("^click add to cart button and click cart link$")
public void click_add_to_cart_button_and_click_cart_link() throws Throwable {
	
	blazeAddtoCartAction.clickAddToCartButton();
	
	blazeAddtoCartAction.clickCartLink();
}

@Then("^click place order button$")
public void click_place_order_button() throws Throwable {
	
	blazeCartPageAction.placeOrderButton();
    
}

@Then("^enter name and country and city and credit card and month and year and click purchase button$")
public void enter_name_and_country_and_city_and_credit_card_and_month_and_year_and_click_purchase_button() throws Throwable {
    
	orderPlaceAction.enterValidInfo(blazeprop.getProperty("Name"),blazeprop.getProperty("Country"),blazeprop.getProperty("City"),blazeprop.getProperty("CreditCard"),blazeprop.getProperty("Month"),blazeprop.getProperty("Year"));
}

@Then("^verify order confirmation received and click ok button$")
public void verify_order_confirmation_received_and_click_ok_button() throws Throwable {
   
	orderPlaceAction.verifyOrderConf();
	
	BlazeUtility.takeMyScreenshot(driver, "Order Confirmation");
	orderPlaceAction.okButton();
	
	
}

}
