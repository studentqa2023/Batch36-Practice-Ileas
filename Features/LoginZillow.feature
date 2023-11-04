Feature: i want to test Zillow login functionality
Scenario: As a tester, i want to login with valid credentials
Given  Browser is open
And User is on the Zillow homepage
When User clicks on the sign in button
And User enters valid email in email field
And Use enters valid password in the password field
And Click on sign-in button
Then Validate user can sign-in successfully