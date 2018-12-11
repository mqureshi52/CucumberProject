Feature: Create A New Account

Scenario: Successfull Account Creation
Given I open the browser
And I navigate to the FreeCrm
When I click on sign up
And I click on Free Edition
And I fill in new user information
And I click agree terms box
And I click on submit button
And I fill in company information
And I click on continue
Then I successfully created new user


