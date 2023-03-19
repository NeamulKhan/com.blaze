Feature:This feature is for order confirmation functionality

@OrderConf
Scenario:verify order confirmation after order placed with valid card
Given Launch "<URL>"
Then click Nexus6 link 
Then click add to cart button and click cart link 
Then click place order button
Then enter name and country and city and credit card and month and year and click purchase button
Then verify order confirmation received and click ok button
