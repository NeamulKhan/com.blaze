package stepDefination;

import com.blazePageAction.AccountProfileAction;
import com.blazePageAction.BlazeHomePageAction;
import com.blazePageAction.BlazeLoginPageAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.Base_Blaze;
import utility.BlazeUtility;

public class BlazeLogin extends Base_Blaze {
	
	BlazeHomePageAction blazeHomePageAction = new BlazeHomePageAction();
	AccountProfileAction accountProfileAction = new AccountProfileAction();
	BlazeLoginPageAction blazeLoginPageAction = new BlazeLoginPageAction();
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	    
		blazeLauchURL(URL);
	}
		
		@Then("^click Log in link$")
		public void click_Log_in_link() throws Throwable {
			
			blazeHomePageAction.clickLoginlink();
		}

		@Then("^enter username and enter password and click log in button$")
		public void enter_username_and_enter_password_and_click_log_in_button() throws Throwable {
		   
			blazeLoginPageAction.enterCredentials(blazeprop.getProperty("Username"), blazeprop.getProperty("Password"));
		}

		@Then("^verify user successfully login with valid credentials$")
		public void verify_user_successfully_login_with_valid_credentials() throws Throwable {
		    
			accountProfileAction.verifyLogin();
			BlazeUtility.takeMyScreenshot(driver," Log in");
			
		}


	}
	
	


