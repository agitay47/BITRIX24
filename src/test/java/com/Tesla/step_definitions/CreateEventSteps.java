package com.Tesla.step_definitions;

import com.Tesla.PomPages.EventPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateEventSteps {

    EventPage eventPage = new EventPage();

    @When("user click on Event button")
    public void user_click_on_event_button() {
        eventPage.clickOnEvent();
    }


    @When("user create event name")
    public void user_create_event_name() {
        eventPage.createEventName();
    }

    @When("user click on members")
    public void user_click_on_members() {
        eventPage.clickOnMembers();
    }

    @When("user click on My Groups")
    public void user_click_on_my_groups() {
        eventPage.clickOnMyGroups();
    }

    @When("user click on Soccer team")
    public void user_click_on_soccer_team() {
        eventPage.clickOnSoccerTeam();
    }

    @When("user should be able to click on close icon")
    public void user_should_be_able_to_click_on_close_icon() {

    }

    @Then("user should be able to send event request")
    public void user_should_be_able_to_send_event_request() {

    }

    @When("click on dropdown menu of event location")
    public void click_on_dropdown_menu_of_event_location() {
        eventPage.clickOnEventLocation();
    }




    @Then("I should be able to select the event location.")
    public void i_should_be_able_to_select_the_event_location() {
       eventPage.clickOnSelectLocation();
    }





}
