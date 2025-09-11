Feature: Find a selected country
  Does a selected country exist in the database

  Scenario: Afghanistan is a country
    Given Selected country is "Afghanistan"
    When Does "Afghanistan" exist
    Then I should be told "Afghanistan" "exits"