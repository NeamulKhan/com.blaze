package com.blazePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base_Blaze;

public class BlazeAboutUsLocator extends Base_Blaze{
	
	public BlazeAboutUsLocator() {
		
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//*[@id=\"example-video\"]/button/span[2]")
	
	public WebElement clickVideoButton; 
	
	
	@FindBy(xpath="//*[@id=\"videoModal\"]/div/div/div[3]/button")
	
	public WebElement videoClose;
		
		
	}
	
	

