
Feature: Login to facebook

Scenario: Login to Facebook with valid credentials
Given User is on Login Page
When USer Enter EmailID
And User Enter Password
And User Click on Login button
Then User should be on HomePage
And User closes browser

Scenario: Login to Facebook with valid credentials
Given User is on Login Page
When USer Enter "asbk@gmail.com" as EmailID
And User Enter "abc@123" as Password
And User Click on Login button
Then User should be on HomePage
And User closes browser
