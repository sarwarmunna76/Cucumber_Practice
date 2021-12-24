
Feature: Your Logo Application test cases

  Scenario Outline: Test case1: Add new address
  	Given Opening the browser
    And Enter email
    Given Enter password
    When Click login
    When Click My addresses
    And Click Update 
    And Update State and City
    Then Click Save
    Then Validate Update
    Then Click SignOut
    Then Quite Browser

Examples:
  | | |
  |  | |
 