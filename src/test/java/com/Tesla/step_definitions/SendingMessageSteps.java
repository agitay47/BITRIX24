package com.Tesla.step_definitions;

import com.Tesla.PomPages.SendingMessagePage;
import com.Tesla.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendingMessageSteps {

    SendingMessagePage sendinMessage = new SendingMessagePage();

    @When("User click Message tab under Active Stream")
    public void user_click_message_tab_under_active_stream() {
        sendinMessage.clickOnEmptyBody();
    }

    @Then("User should be able to click add mention icon")
    public void user_should_be_able_to_click_icon() {
        sendinMessage.clickOnAddMention();
    }

    @Then("User should be able click contacts from the lists provided in dropdown")
    public void user_should_be_able_click_contacts_from_the_lists_provided_in_dropdown() {
        BrowserUtils.clickOnElement(sendinMessage.clickOnContacts);
    }

    @Then("User should be able to click any contacts or all contacts from list")
    public void user_should_be_able_to_click_any_contacts_or_all_contacts_from_list() {
        BrowserUtils.clickOnElement(sendinMessage.clickOnReceiver);
    }

    @Then("User should be able to send message to contacts")
    public void user_should_be_able_to_send_message_to_contacts() {

        sendinMessage.clickOnSend();
    }

}
