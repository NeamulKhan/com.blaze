package com.blazePageAction;

import org.testng.Assert;

import com.blazePageLocator.BlazeCartPageLocator;

import utility.Base_Blaze;

public class BlazeCartPageAction extends Base_Blaze {
	
	BlazeCartPageLocator blazeCartPageLocator = new BlazeCartPageLocator();
	
	public void verifyItemAdded () throws Exception {
		
		Thread.sleep(5000);
		
		boolean verifyCart = blazeCartPageLocator.verifyAddedProduct.isDisplayed();
		
		Assert.assertTrue(verifyCart);
	}
	 
	public void placeOrderButton() throws Exception {
		
		Thread.sleep(3000);
		
		blazeCartPageLocator.placeOrderButton.click();	
		
	}
	
	
	
	}
