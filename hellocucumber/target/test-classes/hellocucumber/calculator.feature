Feature: Does the Calculator work?
  I want to know if my Calculator adds and multiplicates correctly

  Scenario: Does my Calculator multiplicate two numbers correctly
    Given I type the "<firstNumber>" into my calculator
    When I multiplicate it with "<secondNumber>"
    Then My Calculator should return "<answer>"

    Examples:
      | firstNumber | secondNumber |  answer |
      | 2 | 5 |  10 |
      | 3 | 4 |  12 |
      | -2 | 6 |  -12 |
