package com.blazePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base_Blaze;

public class BlazeLoginPageLocator extends Base_Blaze {
	
	public BlazeLoginPageLocator() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="loginusername")
	
	public WebElement username;
	
	@FindBy(id="loginpassword")
	
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	
	public WebElement loginButton;
	
	}


