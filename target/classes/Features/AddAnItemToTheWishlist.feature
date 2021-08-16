Feature: Changing the Price for Laptob and Note Book









@Test7thScenario
Scenario: Adding an item to Wish list


		Given User is on Retail website
		 When User click on Laptop &NoteBook tab 
 		And User click on Show all Laptop &NoteBook option  
		And User click on heart icon to add ‘Sony VaIO’ laptop to wish list  
		Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’