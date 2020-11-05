package com.Tesla.step_definitions;


import com.Tesla.PomPages.LoginPage;
import com.Tesla.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User on login page")
    public void user_on_login_page() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
    }


    @When("user logs in with {string}")
    public void user_logs_in_with_and(String role) {
        loginPage.login(role);
    }


}
