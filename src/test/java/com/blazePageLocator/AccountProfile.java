package com.blazePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base_Blaze;

public class AccountProfile extends Base_Blaze {
	
	public AccountProfile() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="nameofuser")
	
	public WebElement verifyAccountProfile;

}
