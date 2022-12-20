Feature: My Account Test
  As a user I should be able to register with valid credentials

  Background:
    Given I am on homepage

  @sanity @regression
  Scenario: User should navigate to register page successfully
    When I click on My Account link
    And I select Register option
    Then I should navigate to Register page successfully
    And I should see Register Account text

  @smoke @regression
  Scenario: User should navigate so Login Page successfully
    When I click on My Account link
    And I select Login option
    Then I should navigate to Login page successfully
    And I should see Returning Customer text

  @regression
  Scenario: User register account successfully
    When I click on My Account link
    And I select Register option
    And I enter first name
    And I enter last name
    And I enter email
    And I enter phone number
    And I enter password
    And I enter confirm password
    And I click on Yes on Subscribe button
    And I click on Privacy button
    And I click on continue
    And I verify the account creation text
    And i click continue button after account creation
    And I click on My Account link
    And I select Logout option
    And I verify account Logout text
    And I click on continue button
    Then I am able to register an account successfully

  @regression
  Scenario: User should login and logout successfully
    When I click on My Account link
    And I select Login option
    And I enter email address "jamesbond_007@gmail.com"
    And I enter password "Bond"
    And I click on Login button
    And I verify My account Text
    And I click on My Account link
    And I select Logout option
    And I verify account Logout text
    And I click on continue button
    Then I am able to login and logout successfully