Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

Examples:
	| username | password | firstname | lastname | position |
	| santoshu311@gmail.com | Santosh@123@123 | Tom 	  | Peter    | Manager  |
	| naveenk  | test@123 | David 	  | Dsouza   | Director |