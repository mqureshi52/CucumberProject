Feature: LoginFeature

Scenario: Valid Login
Given I open browser
And I navigate to FreeCrm
When I enter username and password
And I click login button
Then I successfully logged in

Scenario: Invalid Login
Given I open browser
And I navigate to FreeCrm
When I enter invalid username and password
And I click login button
Then I see error message