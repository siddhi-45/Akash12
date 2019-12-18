Feature: demo for the bckgrnd understanding

Background: Launch the DemoWebShop XY
Given Application is launched by user XY

Scenario: User Access for registration
Given User clicks on Signup link XY
Then valid data has be provide XY
And Verifies the registration process and perform logout XY

Scenario Outline: User Access for Login XY
Given User clicks on SIgnIN link XY
Then enters valid username "<un>" XY
And enters valid password "<ps>" XY
And Verifies the login process and perform logout

