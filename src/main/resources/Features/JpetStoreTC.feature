Feature: TestCases 
	Test case one
	
Background: Below are the common steps for each scenario 
	Given User Launch browser with JpetStorePage 
	
	Scenario Outline: Register and Login 
	When User click on Sign In botton and click on Register Now! 
	And User enters User Id as "<userId>" and  New password as "<password>" and Repeat password as "<password>" 
	And User enters First name as "<firstName>" and Last name as "<lastName>" and Email as "<email>" and Phone as "<phone>" and AddressOne as "<addressOne>" and AddressTwo as "<addressTwo>" and City as "<city>" and State as "<state>" and Zip as "<zip>" and Country as "<country>" 
	And User selects Language Preference as English and Favourite Category as DOGS and Enable MyList and Enable MyBanner 
	And User click on Save Account Information 
	And User click on Sign In botton and enters User Id as "<userId>" and password as "<password>" and click on Login 
	Then Assert for presence of Sign Out 
	
	Examples: 
		| userId | password |password| firstName | lastName | email | phone | addressOne | addressTwo | city | state | zip | country |
	|siddu@17|siddu|siddu|Siddarth|S|siddu17@gmail.com|9988756000|Chennai|Perungudi|Chennai|TamilNadu|123456|India|
	
	
Scenario Outline: Check Valid Login 
	When User click on Sign In botton and enters User Id as "<userId>" and password as "<password>" and click on Login 
	Then Assert for presence of Sign Out 
	Examples: 
		| userId | password |
	|siddu@12|siddu|
	
	Scenario:  Check Invalid login 
	When clickon signin and enter username "batch6" and password as "siddu" 
	Then assert error message
		
Scenario: Search 
	When User Search for "Fish" and click on search 
	Then Assert for presence of GoldFish and close browser  
	
Scenario: Adding Fish to the cart and proceed to checkout 
	When User click on Sign In botton and enters User Id as "siddu@12" and password as "siddu" and click on Login 
	And buy Fish 
	Then Assert for Suucessful CheckOut and close browser 
	
Scenario: placing dog and fish combine 
	When User fill login details User Id as "siddu@12" and password as "siddu" 
	And selecting two products and checkout 
	Then close the browser 
	
	
	Scenario: Remove 
	When User Update Cart 
	Then User close browser 
	
Scenario: Return to Main Menu 

	When User click on Birds 
	And click on Return to Main Menu 
	Then Assert for Presence of Sign In and close browser 

Scenario: Check Signout 
	When User fill login details User Id as "siddu@12" and password as "siddu"
	And check signout happens or not 
	Then close the browser 
	

	
#	