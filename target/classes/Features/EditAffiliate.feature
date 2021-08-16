Feature: Edit affiliate information



Background:
     Given User is on Retail website 
     And User click on My Account
     And User click on Login
     And User put the email address
     And user put the password
    Then User click on login Button

@Test11
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer


    
	When User click on ‘Edit your affiliate informationlink 
	And user click on Bank Transfer radio button 
	And User fill Bank information with below information 
		|bankName|abaNumber|swiftCode|accountName|accountNumber| 
	And User click on Continue button 
	Then User should see a success messag