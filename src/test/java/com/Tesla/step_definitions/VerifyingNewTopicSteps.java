package com.Tesla.step_definitions;

import com.Tesla.PomPages.SendingMessagePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyingNewTopicSteps {

    SendingMessagePage sendingMessagePage = new SendingMessagePage();

    @When("user clicks on {string}")
    public void user_clicks_on(String string) {
        sendingMessagePage.clickOnMessage(string);
    }

    @Then("user click small box icon")
    public void user_click_small_box_icon() {
        sendingMessagePage.clickOnTopic();
    }

    @Then("user should be to create a new {string} sign on the top")
    public void user_should_be_to_see_a_new_pop_up_window_with_sign_on_the_top(String string) {
        sendingMessagePage.createNewTopic(string);
    }
}
