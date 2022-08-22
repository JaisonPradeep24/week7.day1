Feature: Create a new lead in leaftaps Application

Background: Positive Login

Given type the username 'demosalesmanager'
And type the password 'crmsfa'
When clicking on the submit button
Then verify the home page is displayed

Scenario Outline: create leads with different data
Given click SRMFA link
And click leads tab
And click create lead link
And type the Company name as <companyName>
And type the first name as <firstName>
And type the last name as <lastName>
And click create leads Button
Then verify the view leads page

Examples:
|companyName|firstName|lastName|
|Google|Jaison|Pradeep|
|Microsoft|Rolex|Vintage|

