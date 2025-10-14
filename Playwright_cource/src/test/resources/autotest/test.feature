Feature: Playwright Tests

  Scenario: Check catalog items
    Given I open the Playwright catalog items page
    When I check the catalog items
    Then I verify catalog items are displayed

  Scenario: Check footer
    Given I open the Playwright footer page
    When I check for the footer
    Then I verify the footer is displayed

  Scenario: Check logo
     Given I open the Playwright logo page
     When I check for the logo
     Then I verify the logo is displayed

  Scenario: Check navigation menu
     Given I open the Playwright pagination page
     When I check for the pagination number
     Then I verify the pagination is displayed

  Scenario: Check page H1
    Given I open the Playwright H1 header page
    When I check for the H1 header
    Then I close the browser after checking tests