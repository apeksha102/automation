@basket
Feature: basket
  As a Customer
  I want to buy my selective item
  So that I can purchase or buy my desire Product
@smoke
  Scenario: Desire item add to basket
    Given  I am on the homepage
    When I search product "puma"
    And I click on my selective item from list
    And I click on adding to trolley option
    And I click on go to trolley option
    Then I Should see my clicked item its matching with my basket item









