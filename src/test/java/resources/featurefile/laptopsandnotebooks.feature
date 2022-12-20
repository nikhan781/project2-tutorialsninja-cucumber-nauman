Feature: Laptops And NoteBooks Test
  As a user I should be able to place an order

  Background:
    Given I am on homepage

  @sanity @regression
  Scenario: User should see products displayed from High to Low price successfully
    When I hover the over Laptops and Notebooks link
    And I click on Show All Laptops and Notebooks link
    And I sort the price by High To Low
    Then I should see products displayed from High to Low price successfully

  @smoke @regression
  Scenario: User should be able to place order successfully
    When I hover mouse over menu "laptops & NoteBooks"
    And I select option "Show All Laptops & Notebooks"
    And I sort the products in High to Low price
    And i select a product "MacBook"
    And I verify product name "MacBook"
    And I click on Add to Cart button
    And I verify the message Success: You have added MacBook to your shopping cart!
    And I click on Shopping Cart Button in Message
    And I change the currency to Pound
    And I verify "Shopping Cart  (0.00kg)" on Shopping cart page
    And I verify product name in cart is "MacBook"
    And I update the quantity to "2"
    And I verify the message as "Success: You have modified your shopping cart!"
    And I verify the total price "£737.45"
    And I click on checkout button
    And I verify the text "Checkout"
    And I verify the text as "New Customer"
    And I click on Guest Checkout button
    And I click on customer checkout continue button
    And I enter First name "Prime"
    And I enter Last name "Testing"
    And I enter Email "prime"
    And I enter Telephone Number "0123456789"
    And I enter Address "1 London Road"
    And I enter City "London"
    And I enter Postcode "BB1 2B"
    And I select Country " United Kingdom"
    And I select Region "Greater London"
    And I click on Guest Continue button
    And I add a comment "Please wrap it in Red"
    And I click on term and conditions box
    And I click on continue button in comment section
    And I verify the message "Warning: No Payment options are available. Please contact us for assistance!"
    Then I should be able to place order successfully


