@Event
Feature: Creating Events

  Background: Common Steps
    Given  User on login page
    When user logs in with "help desk"

  @event
  Scenario: Creating an event
    And user click on Event button
    And user create event name
    And user click on members
    And user click on My Groups
    And user click on Soccer team
    And user should be able to click on close icon
    Then user should be able to send event request

  @Select_Event
  Scenario: Select Event Location

    When user click on Event button
    And click on dropdown menu of event location
    Then I should be able to select the event location.