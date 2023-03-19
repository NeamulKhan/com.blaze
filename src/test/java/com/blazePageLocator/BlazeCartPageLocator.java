package com.blazePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base_Blaze;

public class BlazeCartPageLocator extends Base_Blaze {
	
	
	public BlazeCartPageLocator() {
		
		PageFactory.initElements(driver,this);
		
		
	}

	@FindBy(xpath="//*[@id=\"tbodyid\"]/tr[1]/td[2]")
	
	public WebElement verifyAddedProduct;
	
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button")
	
	public WebElement placeOrderButton;
	
}
