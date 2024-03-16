Feature: : test home page feature
  Scenario Outline: : test input textox
    Given when user navigate to website "https://www.rahulshettyacademy.com/AutomationPractice/"
    And user inputs the text as "text"
    When user closes the application
    Examples:
      | text |
      | Dinesh |
      |pranav|