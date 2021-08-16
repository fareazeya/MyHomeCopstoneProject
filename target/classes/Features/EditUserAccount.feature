Feature: Editing user account 







Background: 
	Given User is on Retail website 
	And User click on My Account 
	And User click on Login 
	And User put the email address 
	And user put the password 
	Then User click on login Button 
	
	
@FinalTest12 
Scenario: Edit your account Information 


	When User click on ‘Edit your account information’ link 
	And User modify below information 
	|firstname|lastName|email|telephone| 
	And  User click on continue button 
	Then User should see a message ‘Success: Your account has been successfully updated.’