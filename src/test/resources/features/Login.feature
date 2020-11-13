@login @smoke
Feature: Login to Bitrix24

  Background: Common Steps
    Given  User on login page
    When user logs in with "help desk"

  Scenario: Login as a Help Desk

  @sendMessage
  Scenario:User should be able to send message to contact
    And User click Message tab under Active Stream
    Then User should be able to click add mention icon
    And User should be able click contacts from the lists provided in dropdown
    And User should be able to click any contacts or all contacts from list
    Then User should be able to send message to contacts


  @Verify_topic
  Scenario: Verifying new Topic
    And user clicks on "Message"
    Then user click small box icon
    Then user should be to create a new "title" sign on the top
    Then User should be able to send message to contacts














