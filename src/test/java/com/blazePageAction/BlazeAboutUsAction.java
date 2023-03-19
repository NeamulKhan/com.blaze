package com.blazePageAction;

import org.testng.Assert;

import com.blazePageLocator.BlazeAboutUsLocator;

import utility.Base_Blaze;

public class BlazeAboutUsAction extends Base_Blaze {
	
	BlazeHomePageAction blazeHomePageAction = new BlazeHomePageAction();
	
	BlazeAboutUsLocator blazeAboutUsLocator = new BlazeAboutUsLocator();
	
	public void clickVideoButton() throws Exception {
		
		Thread.sleep(5000);
		
	
		
		boolean verifyVideo = blazeAboutUsLocator.clickVideoButton.isEnabled();
		
		Assert.assertTrue(verifyVideo);
		
				
	}
	
	public void clickCloseButton() throws Exception {
		
		Thread.sleep(5000);
		
		blazeAboutUsLocator.videoClose.click();
		
	}

}
