Feature: The DHBW Address is shown correctly in the footer

  Scenario: Lookup the Address at the DHBW-Homepage
    Given I open the Chrome Browser
    When I go to the DHBW Page "http://www.karlsruhe.dhbw.de/startseite" and read the Address
    Then The Name should be "DHBW Karlsruhe"
    And The Street should be "Erzbergerstraße 121"
    And The Postal Code should be "76133"
    And The City should be "Karlsruhe"