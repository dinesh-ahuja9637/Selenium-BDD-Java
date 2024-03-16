Feature: : test home page feature
  Background:
    Given when user navigate to website "https://www.rahulshettyacademy.com/AutomationPractice/"
    And user inputs the text as "Demo"

  @titleA
    Scenario: : test input testbox
      #Given when user navigate to website "https://www.rahulshettyacademy.com/AutomationPractice/"
    #And user inputs the text as "Demo"
    When user closes the application

    @title
    Scenario: test get title of the page
      #Given when user navigate to website "https://www.rahulshettyacademy.com/AutomationPractice/"
      #And user inputs the text as "Demo"
      Then user verifies the title of the page and if it matches then perform next step
      When user closes the application

      #Scenario: test
       # Given user print it