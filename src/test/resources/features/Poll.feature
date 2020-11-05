@Poll
Feature: Creating a Poll

  Background: Common Steps
    Given  User on login page
    When user logs in with "help desk"

  @Poll_1
  Scenario: Create a poll as helpDesk person
    And User click on "Poll"
    Then User creating a questions
    And User add Answer1
    And User add Answer2
    And User add Answer3
    Then User should be able to send Poll to All employees

  @Task
  Scenario: Create a task
    And click on Task
    Then create title to do
    Then click on calendar
  #  And click on Month
    And click on Day
    Then click on select button
    Then click on send
    Then verify that "NEWROZ" displayed

  @Poll_2
  Scenario Outline: Create an another poll
    And User click on "Poll"
    Then User create '<Topic>'
    Then User creating a '<Question>'
    And User add '<Answer1>'
    And User add second '<Answer2>'
    And User add third '<Answer3>'
    And User add forth '<Answer4>'
    Then User should be able to send Poll to All employees
    Examples:
      | Topic    | Question                       | Answer1   | Answer2   | Answer3 | Answer4 |
      | Cybertek | How much do you like Cybertek? | I love it | I like it | Ehh     | Nehh    |





