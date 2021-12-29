Feature: all login scenarios

  Background: opening browser and maximizing it
    Given I open browser
    And I maximize it


  @login
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
   # When I enter correct username and password
    When I enter "admin" and "admin" as username and password
    And I click on login button
    Then I should be redirected to homepage

  @login
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
    #When I enter incorrect username and password
    When I enter "sdsds" and "dsds" as username and password
    And I click on login button
    Then I should get an error

  @login
  Scenario: to test the functionality of login button for blank input
    Given I am on login page
    #When I enter blank username and password
    When I enter "" and "" as username and password
    And I click on login button
    Then I should get another error

    @userReg
    Scenario: to test the functionality of submit button for user registration
      Given I am on user registration page
      When I enter below data
      | amol | amol@gmail.com | 788778 | pune |
      And I click on submit button
      Then user should be added

  @loginParam
  Scenario Outline: to test the functionality of login button for valid input
    Given I am on login page
   # When I enter correct username and password
    When I put <username> and <password>
    And I click on login button
    Then I should see correct <page title>
    Examples:
      | username | password | page title     |
      | admin    | admin    | dashboard page |
      | sdsds    | dsdsd    | login title    |
      | another  | another  | login title    |
