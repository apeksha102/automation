@search
Feature: search
  As a customer
  I want to search
  So that  i can buy or view my respective products
@regression
  Scenario Outline: search for a valid product
    Given  I am on the homepage
    When I search product "<searchItem>"
    Then I should be able to see my respective products
    Examples:
  |searchItem|
  |nike|
  |puma|
