Feature: Does Google sets the Page Title correctly?

  Scenario: I search a keyword in google
    Given I open the Chrome Browser and go to "http://www.google.com"
    When I write "katzenbabys" into the search bar
    And I klick on the serach button
    Then the page title should be set correctly