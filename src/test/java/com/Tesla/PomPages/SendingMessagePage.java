package com.Tesla.PomPages;

import com.Tesla.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendingMessagePage extends BasePage{



    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    private WebElement emptyBody;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    private WebElement addMention;

    @FindBy(xpath = "//a[@href='#switchTab'][2]")
    public WebElement clickOnContacts;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name'][1]")
    public WebElement clickOnReceiver;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    private WebElement send;

    @FindBy(xpath = "(//*[.='Message'])[2]")
    private WebElement message;

    @FindBy(xpath = "//*[@title='Topic']")
    private WebElement topic;

    @FindBy(xpath = "//*[@id='POST_TITLE']")
    private WebElement createTopic;

    public void clickOnEmptyBody() {
        BrowserUtils.clickOnElement(emptyBody);
    }

    public void clickOnAddMention() {
       BrowserUtils.clickOnElement(addMention);
    }

    public void clickOnMessage(String string){
        BrowserUtils.clickOnElement(message);
    }

    public void clickOnTopic(){
        BrowserUtils.clickOnElement(topic);
    }

    public void createNewTopic(String string){
        BrowserUtils.enterText(createTopic,"BATCH20");
    }

    public void clickOnSend(){
        BrowserUtils.clickOnElement(send);
    }







}
