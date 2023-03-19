package com.blazePageAction;

import org.openqa.selenium.support.PageFactory;

import com.blazePageLocator.BlazeAddtoCartLocator;

import utility.Base_Blaze;

public class BlazeAddtoCartAction extends Base_Blaze{
	
	BlazeAddtoCartLocator blazeAddtoCartLocator = new BlazeAddtoCartLocator();
	
	public void clickAddToCartButton() throws Exception {
	
		Thread.sleep(3000);
	blazeAddtoCartLocator.addToCartButton.click();
	
	Thread.sleep(5000);
	
	driver.switchTo().alert().accept();
    
}
	public void clickCartLink() {
		
		blazeAddtoCartLocator.cartLink.click();
		
	}
	
	
	
}
