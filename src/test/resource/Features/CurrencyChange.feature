Feature: Home Page

Background:
Given User is on Retail website


@Test13
Scenario: User verify currency values change

  
  When User click on Currency 
  And User Chose Euro from dropdown 
  Then currency value should change to Euro 