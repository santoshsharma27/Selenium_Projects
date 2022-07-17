Feature: Free CRM Login feature

Scenario Outline: Free CRM Login Test Scenario
Given User is already on Login Page
When User navigate to Login Page
Then User enters "<username>" and "<password>"
Then User clicks on Login Button
Then Close the Browser

Examples:
	|username | password |
	|santoshu311@gmail.com| Santosh@123 |
	|tom | 12345 |