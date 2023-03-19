package com.blazePageAction;

import com.blazePageLocator.BlazeLoginPageLocator;

import utility.Base_Blaze;

public class BlazeLoginPageAction extends Base_Blaze {
	
	BlazeLoginPageLocator blazeLoginPageLocator = new BlazeLoginPageLocator();
	
	public void enterCredentials(String x, String y) throws Exception {
		
		blazeLoginPageLocator.username.sendKeys(x);
		blazeLoginPageLocator.password.sendKeys(y);
		blazeLoginPageLocator.loginButton.click();
		   
		
		
	}

}
