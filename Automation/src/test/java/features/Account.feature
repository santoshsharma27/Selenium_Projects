Feature: Portal Login

Background:
Given Validate the browser
When Browser is trigerred
Then Check if browser is started

@PortalTest
Scenario: Home Page default login 
	Given User is on NetBanking landing page 
	When User login into application with "jin" and password "12345" 
	Then Home page is populated 
	And Cards are displayed as "true" 
	
@PortalTest
Scenario: Home Page default login 
	Given User is on NetBanking landing page 
	When User login into application with "john" and password "54321" 
	Then Home page is populated 
	And Cards are displayed as "false" 

@PortalTest
Scenario: Home Page default login 
	Given User is on NetBanking landing page 
	When User sign up with following details 
		| jenny | abcd | john@abc.com | India | 7003189453 |
	Then Home page is populated 
	And Cards are displayed as "false" 

@PortalTest
Scenario Outline: Home Page default login 
	Given User is on NetBanking landing page 
	When User login into application with "<username>" and "<password>" 
	Then Home page is populated 
	And Cards are displayed as "false" 
	
	Examples: 
		|username | password |
		|santoshu311@gmail.com| Santosh@123 |
		|tom | 12345 |
		|Tina | 123456 |
		|Hari | 54321 |