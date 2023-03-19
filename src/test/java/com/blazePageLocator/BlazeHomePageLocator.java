package com.blazePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base_Blaze;

public class BlazeHomePageLocator extends Base_Blaze {
	
	public BlazeHomePageLocator() {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(id="login2")
	
	public WebElement loginLink;
	
	@FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[3]/a")
	
	public WebElement aboutUsLink;
	
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")
	
	public WebElement Nexus6Link;
	
	
		
	}
	

