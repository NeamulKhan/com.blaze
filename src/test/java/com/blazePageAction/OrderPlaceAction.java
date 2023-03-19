package com.blazePageAction;

import org.testng.Assert;

import com.blazePageLocator.OrderPlaceLocator;

import utility.Base_Blaze;

public class OrderPlaceAction extends Base_Blaze {
	
	OrderPlaceLocator orderPlaceLocator = new OrderPlaceLocator();
	
	public void enterValidInfo (String a, String b,String c, String d,String e, String f) throws Exception {
		
		orderPlaceLocator.name.sendKeys(a);
		orderPlaceLocator.country.sendKeys(b);
		orderPlaceLocator.city.sendKeys(c);
		orderPlaceLocator.creditCard.sendKeys(d);
		orderPlaceLocator.month.sendKeys(e);
		orderPlaceLocator.year.sendKeys(f);
		
		Thread.sleep(5000);
		orderPlaceLocator.purchaseButton.click();
	}

	public void verifyOrderConf() throws Exception {
		
		Thread.sleep(5000);
		boolean veryfyOrder = orderPlaceLocator.verifyPurchaseConf.isDisplayed();
		
		Assert.assertTrue(veryfyOrder);
		
	}
	
	public void okButton() throws Exception {
		Thread.sleep(5000);
		orderPlaceLocator.okButton.click();
	}
	
}
