package com.Tesla.PomPages;

import com.Tesla.utils.BrowserUtils;
import com.Tesla.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    //To not use web elements directly in step definition classes
    //helps to prevent code duplication and keep step definitions clean
    @FindBy(name = "USER_LOGIN")
    private WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginClick;

    @FindBy(xpath = "//div[@class='errortext']")
    private WebElement warningMessage;

    public WebElement getUsernameInput() {
        return usernameInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public String getWarningMessageText() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return warningMessage.getText().trim();
    }

    public void login(String usernameValue, String passwordValue) {
        usernameInput.sendKeys(usernameValue);
        passwordInput.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login() {
        String usernameValue = ConfigurationReader.getProperty("username.helpDesk");
        String passwordValue = ConfigurationReader.getProperty("password");

        usernameInput.sendKeys(usernameValue);
        passwordInput.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login(String role) {
        String usernameValue = "";
        String passwordValue = ConfigurationReader.getProperty("password");

        if (role.equalsIgnoreCase("hr")) {
            usernameValue = ConfigurationReader.getProperty("username.hr");
        } else if (role.equalsIgnoreCase("marketing")) {
            usernameValue = ConfigurationReader.getProperty("username.marketing");
        } else if(role.equalsIgnoreCase("help desk")){
            usernameValue = ConfigurationReader.getProperty("username.helpDesk");
        }

        BrowserUtils.enterText(getUsernameInput(),usernameValue);
        BrowserUtils.enterText(getPasswordInput(),passwordValue);

        BrowserUtils.clickOnElement(loginClick);

    }


}
