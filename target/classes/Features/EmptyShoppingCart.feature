Feature: Checking Cart

Background:
Given User is on Retail website


@LastOne
Scenario: User empty Shopping cart message displays 
    
    When User click on shopping cart 
    Then “Your shopping cart is empty!” message should display