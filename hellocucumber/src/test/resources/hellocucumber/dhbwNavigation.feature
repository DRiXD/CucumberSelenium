Feature: The Navigation Bar is there and can be opened
  
  Scenario: Open the Navigation Bar on DHBW Homepage
    Given I open the Chrome Browser and go to the Page "http://www.karlsruhe.dhbw.de/startseite"
    When I click on the navigation menu button
    Then The navigation menu should scroll down