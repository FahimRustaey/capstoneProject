Feature: Login to Retail website 
#if you put a Tag like  @CompleteTestCase at the top of (Feature:), 
#then copy this to the TestRunner page, that will print all scenarios for you

#In feature will be use a comment 
#Every Feature file starts with Feature: <Name of Feature>

Background:
Given User is on Retail Website
#Background will be use for all feature file first, then the feature file will be run

@login @Regression @SmokeTest 
Scenario: Login to MyAccount

When User click on MyAccount
And  User click on Login
And User enter userName 'eagles@tekschool.us' and password 'eagles'
And User click on Login button
Then User should be logged in to myAccount Dashboard

#instead of writting this scenario 3 times and changing values, 
#cucumber provides scenario outline with example kewords to do data driven testing

@test
Scenario Outline: Login to MyAccount with Multiple users
	
	When User click on MyAccount
	And  User click on Login
	And User enter userName '<userName>' and password '<password>'
	And User click on Login button
	Then User should be logged in to myAccount Dashboard
	
	Examples:
	|userName|password|
	|eagles@tekschool.us|eagles|
	|hawks@tekschool.us|hawks|
	|falcons@tekschool.us|falcons|
	
	#this example is for cucumber Data Table
	@RegisterTestCase
	Scenario: Register new user to Retail Website
		
	When User click on MyAccount
	And User click on Register option 
	And User fill the Registration form with below information
	|firstName|lastName|eMail|telephone|password|passwordConfirm|Subscribe|
	|Jamoo|bondoo|jbondoosdo@tekschool.us|2021015567|bond70|bond70|no|
	And User accept the privacy and policy
	And User click on continue button
	Then User should be registered in Retail Website
	
	