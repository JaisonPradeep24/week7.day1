Feature: Login to Leaftaps application

@Smoke
Scenario: Positive Login
Given type the username 'demosalesmanager'
And type the password 'crmsfa'
When clicking on the submit button
Then verify the home page is displayed