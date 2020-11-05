package com.Tesla.PomPages;

import com.Tesla.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventPage extends BasePage {

    @FindBy(xpath = "(//span[.='Event'])[2]")
    private WebElement Event;

    @FindBy(xpath = "//input[@name='EVENT_NAME']")
    private WebElement eventName;

    @FindBy(xpath = "//*[@id='feed-event-dest-add-link']")
    private WebElement members;

    @FindBy(xpath = "//*[@id='destGroupTab_calnAJEM3']")
    private WebElement groups;

    @FindBy(xpath = "//*[.='Soccer team'][@class='bx-finder-box-item-t7-name']")
    private WebElement soccerTeam;

    @FindBy(xpath = "//*[@class='popup-window-close-icon']")
    private WebElement closeIcon;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    private WebElement send;

    @FindBy(id = "event-locationcal_3Jcl")
    private WebElement eventLocation;

    @FindBy(xpath = "//*[@name='EVENT_LOCATION']")
    private WebElement selectLocation;


    public void clickOnEvent() {

        BrowserUtils.clickOnElement(Event);
    }

    public void createEventName() {
        BrowserUtils.enterText(eventName, "Newroz");
    }

    public void clickOnMembers() {
        BrowserUtils.clickOnElement(members);
    }

    public void clickOnMyGroups() {
        BrowserUtils.clickOnElement(groups);
    }

    public void clickOnSoccerTeam() {
        BrowserUtils.clickOnElement(soccerTeam);
    }

    public void clickOnCloseIcon() {
        BrowserUtils.clickOnElement(closeIcon);
    }

    public void clickOnSend() {
        BrowserUtils.clickOnElement(send);
    }

    public void clickOnEventLocation(){
        BrowserUtils.clickOnElement(eventLocation);
    }

    public void clickOnSelectLocation(){
        BrowserUtils.clickOnElement(selectLocation);
    }
}
