package com.blazePageAction;

import com.blazePageLocator.BlazeHomePageLocator;

import utility.Base_Blaze;

public class BlazeHomePageAction extends Base_Blaze {
	
	BlazeHomePageLocator blazeHomePageLocator = new BlazeHomePageLocator();
	
	public void clickLoginlink() throws Exception {
		
		blazeHomePageLocator.loginLink.click();
		
		Thread.sleep(5000);
		
	}
	
	public void clickAboutUsLink() {
		
		blazeHomePageLocator.aboutUsLink.click();
		
	}
	public void clickNexus6Link() {
		
		blazeHomePageLocator.Nexus6Link.click();
	}
	
	
}
