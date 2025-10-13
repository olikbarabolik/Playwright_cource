Feature: Playwright Tests

  Scenario: Check catalog items
    Given I open the Playwright catalog items page
    When I check the catalog items
    Then I verify catalog items are displayed