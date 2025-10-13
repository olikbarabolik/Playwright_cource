Feature: Playwright Tests

  Scenario: Check catalog items
    Given I open the Playwright catalog items page
    When I check the catalog items
    Then I verify catalog items are displayed

  Scenario: Check footer
    Given I open the Playwright footer page
    When I check for the footer
    Then I verify the footer is displayed