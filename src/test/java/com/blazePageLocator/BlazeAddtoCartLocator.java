package com.blazePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base_Blaze;

public class BlazeAddtoCartLocator extends Base_Blaze {
	
	public BlazeAddtoCartLocator() {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[2]/div/a")
	
	public WebElement addToCartButton;
	
	@FindBy(id="cartur")
	
	public WebElement cartLink;
	

}
