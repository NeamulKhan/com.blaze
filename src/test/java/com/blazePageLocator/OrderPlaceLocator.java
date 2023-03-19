package com.blazePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base_Blaze;

public class OrderPlaceLocator extends Base_Blaze {
	
	
	public OrderPlaceLocator () {
		
		PageFactory.initElements(driver,this);
						
	}
	
	@FindBy(id="name")
	
	public WebElement name;
	
	
	@FindBy(id="country")
	
	public WebElement country;
	
	
	@FindBy(id="city")
	
	public WebElement city;
	
	@FindBy(id="card")
	
	public WebElement creditCard;
	
	@FindBy(id="month")
	
	public WebElement month;
	
	@FindBy(id="year")
	
	public WebElement year;
	
	@FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	
	public WebElement purchaseButton;
	
	@FindBy(xpath="/html/body/div[10]")
	
	public WebElement verifyPurchaseConf;
	
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	
	public WebElement okButton;
}
