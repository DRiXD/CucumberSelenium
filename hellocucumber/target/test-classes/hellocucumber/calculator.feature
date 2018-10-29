Feature: Does the Calculator work?
  I want to know if my Calculator adds and multiplicates correctly

  Scenario: Can my Calculator add two numbers?
    Given I type in 3
    When I add the number 4
    Then The Calculator should add and return 7


  Scenario Outline: Can my Calculator multiplicate numbers with 5?
    Given I type in 5
    When I type in the number "<firstNumber>"
    Then The Calculator should multiplicate and return "<answer>"

    Examples:
      | firstNumber | answer |
      | 2 | 10 |
      | 5 | 25 |
      | -6 | -30 |


