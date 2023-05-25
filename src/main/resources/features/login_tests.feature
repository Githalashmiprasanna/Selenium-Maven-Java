@tag
Feature: SAML Login Validation

  Background: User opens website
    Given user is on home page

  @tag1
  Scenario: Verify the valid login
    Given I want to launch the url
    When I enter the username and password
    Then I am loggen in
