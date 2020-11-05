package com.Tesla.step_definitions;

import com.Tesla.PomPages.PollPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePollStep {

    PollPage pollPage = new PollPage();

    @When("User click on {string}")
    public void user_click_on(String string) {
        pollPage.clickOnPoll();
    }

    @Then("User creating a questions")
    public void user_creating_a_questions() {

        pollPage.createQuestion();
    }

    @Then("User add Answer1")
    public void user_add_answer1() {

        pollPage.createAnswer1();
    }

    @Then("User add Answer2")
    public void user_add_answer2() {

        pollPage.createAnswer2();
    }

    @Then("User add Answer3")
    public void user_add_answer3() {

        pollPage.createAnswer3();
    }


    @Then("User should be able to send Poll to All employees")
    public void user_should_be_able_to_send_poll_to_all_employees() {

        pollPage.clickOnSend();
    }


    @Then("User create {string}")
    public void user_create(String Topic) {
        pollPage.createTopic(Topic);
    }


    @Then("User creating a {string}")
    public void user_creating_a(String Question) {
        pollPage.createQuestions(Question);
    }

    @Then("User add {string}")
    public void user_add(String Answer1) {
        pollPage.firstAnswer(Answer1);
    }

    @Then("User add second {string}")
    public void user_add_second(String Answer2) {
        pollPage.secondAnswer(Answer2);
    }

    @Then("User add third {string}")
    public void user_add_third(String Answer3) {
        pollPage.thirdAnswer(Answer3);
    }

    @Then("User add forth {string}")
    public void user_add_forth(String Answer4) {
        pollPage.forthAnswer(Answer4);
    }
}



