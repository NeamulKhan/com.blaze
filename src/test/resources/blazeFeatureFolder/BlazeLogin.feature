Feature:This feature is for login functionality

@BlazeLogin
Scenario: verify user can login with valid credentials
Given Launch "<URL>"
Then click Log in link
Then enter username and enter password and click log in button
Then verify user successfully login with valid credentials