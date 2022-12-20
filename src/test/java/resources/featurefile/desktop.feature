Feature: Desktop test

  As a user I should be able to add product in cart

  Background:
    Given I am on homepage

  @sanity @regression
  Scenario: User should be able arrange products in alphabetical order
    When I hover mouser over Desktop link
    And I click on Show All Desktops
    And I select Z to A in sort by drop down bar
    Then Is should be able to see product arranged in descending alphabetical

  @smoke @regression
  Scenario: User should be able to added product to shopping cart successFully
    When I hover mouser over Desktop link
    And I click on Show All Desktops
    And I select Sort By position A to Z "Name: A to Z"
    And I change the currency to Pound
    And I select product HP
    And I verify the Text "HP LP3065"
    And I select Delivery month and year
    And I select Delivery Day
    And I enter Qty
    And I click on Add to Cart button
    And I verify the Message
    And I click on link shopping cart display into success message
    And I verify the cart text "Shopping Cart  (1.00kg)"
    And I verify the Product name "HP LP3065"
    And I verify the Delivery Date "Delivery Date: 2022-11-30"
    And I verify the Model
    And I verify the price "£74.73"
    Then should be able to added product to shopping cart successFully