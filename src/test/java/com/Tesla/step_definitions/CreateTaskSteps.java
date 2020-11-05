package com.Tesla.step_definitions;

import com.Tesla.PomPages.TaskPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateTaskSteps {

    TaskPage taskPage = new TaskPage();

    @When("click on Task")
    public void click_on_task() {
        taskPage.clickOnTask();
    }

    @Then("create title to do")
    public void create_title_to_do() {
        taskPage.createTitle();
    }

    @Then("click on calendar")
    public void click_on_calendar() {
        taskPage.clickOnCalendar();
    }

    @Then("click on Day")
    public void click_on_day() {
        taskPage.clickOnDay();
    }

    @Then("click on select button")
    public void click_on_select_button() {
        taskPage.clickOnSelect();
    }

    @Then("click on send")
    public void click_on_send() {
        taskPage.clickOnSend();
    }


    @Then("verify that {string} displayed")
    public void verifyThatDisplayed(String arg0) {
        taskPage.verifyTitle(arg0);
    }
}
