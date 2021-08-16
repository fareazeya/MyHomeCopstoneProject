Feature: Canon EOS 5D should be add to the card
		

		
@testThird
Scenario: User add Canon EOS 5D from Desktops tab to the cart
		Given User is on Retail website
		When User click on Desktops tab 
		And User click on Show all desktops
		And User click  ADD TO CART option on ‘Canon EOS 5D’ item 
		And User select color from dropdown ‘Red’
		And User select quantity 1 
		And User click add to Cart button 
		Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’