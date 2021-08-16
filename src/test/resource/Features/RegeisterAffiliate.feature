Feature: Register Affiliate 





@Test10
Scenario: Register as an Affiliate user with Cheque Payment Method
 
   Given User is on Retail website 
   And User click on My Account
   And User click on Login
   And User put the email address
   And user put the password
   Then User click on login Button
   When User click on ‘Register for an Affiliate Account’ link 
   And User fill affiliate form with below information |company|website|taxID|paymentMethod| 
   And User put Cheque Payee Name
   And User check on About us check box 
   Then User should see a success message