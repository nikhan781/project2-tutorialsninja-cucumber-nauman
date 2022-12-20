Feature: Top Menu Test

  Background:
    Given I am on homepage

  @sanity @regression
  Scenario Outline: As a user I should be able to navigate to Desktops page Successfully
    When I hover mouse over "<menu>"
    And I select "<submenu>"
    Then I should be able to navigate to Desktop page successfully
    And I should see "<pagename>" text
    Examples:
      | menu                | submenu                      | pagename            |
      | Desktops            | Show All Desktops            | Desktops            |
      | Laptops & Notebooks | Show All Laptops & Notebooks | Laptops & Notebooks |
      | Components          | Show All Components          | Components          |
