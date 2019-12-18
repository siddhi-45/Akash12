Feature: Checking features of DemoWebshop 

@sanity
Scenario: User access the website and do registeration
Given Demowebshop website is launched
And User clicks on register link
When User enters the details
Then Clicks on register button for account creation
 
 @Regression
Scenario: Registered user logs into DemowebShop  
Given Registered user clicks on Login Link 
Then User enters the required credentials 
And Clicks on Login button to acces the website
 
@Regression @smoke
Scenario: User acces to website and search for item 
Given Registered user is successfully logged in DemowebShop 
When User enters name of particular item in the search bar
And Click on search button 
Then Details of searched item is displayed

@smoke 
Scenario: User adds the searched product to cart
Given User verifies the details mentioned of product
Then User clicks on Add to Cart button
