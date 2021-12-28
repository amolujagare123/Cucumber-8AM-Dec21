Feature: all login scenarios

  Scenario: to test the functionality og login button for valid input
    Given I am on login page
    When I enter correct username and password
    And I click on login button
    Then I should be redirected to homepage


