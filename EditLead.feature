Feature: Edit the existing lead from the Leaftaps application

Background: Positive Login

Given type the username 'demosalesmanager'
And type the password 'crmsfa'
When clicking on the submit button
Then verify the home page is displayed
Given click SRMFA link
And click leads tab

Scenario Outline: edit leads with first data
Given click on the find leads from shortcuts
And type the firstname as <firstName>
And click on the find leads submit button
And click on the first resulting lead
And click on the edit button
And change the companyname as <companyName>
And click on the update button
Then verify if the changed company name appears

Examples:
|firstName|companyName|
|Jaison|NatWest|

