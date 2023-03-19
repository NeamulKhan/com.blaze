package com.blazePageAction;

import org.testng.Assert;

import com.blazePageLocator.AccountProfile;

import utility.Base_Blaze;

public class AccountProfileAction extends Base_Blaze {
	
	AccountProfile accountProfile = new AccountProfile();
	
	public void verifyLogin() throws Exception {
		
		Thread.sleep(5000);
		
		boolean verifyAccount = accountProfile.verifyAccountProfile.isDisplayed();
		
		Assert.assertTrue(verifyAccount);
		
	}

}
