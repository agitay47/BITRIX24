package com.Tesla.PomPages;

import com.Tesla.utils.BrowserUtils;
import com.Tesla.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollPage extends BasePage {

    public PollPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']//span")
    private WebElement poll;

    @FindBy(xpath = "//input[@name='UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][QUESTION]']")
    private WebElement questions;

    @FindBy(xpath = "//input[@placeholder='Answer  1']")
    private WebElement answer1;

    @FindBy(xpath = "//input[@placeholder='Answer  2']")
    private WebElement answer2;

    @FindBy(xpath = "//input[@placeholder='Answer  3']")
    private WebElement answer3;

    @FindBy(xpath = "//input[@placeholder='Answer  4']")
    private WebElement answer4;


    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    private WebElement send;

    @FindBy(id = "POST_TITLE")
    private WebElement topic;



    public void clickOnPoll(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(poll)).click();
    }

    public void createQuestion(){

        BrowserUtils.enterText(questions,"How did you like Cucumber?");
    }

    public void createAnswer1(){

        BrowserUtils.enterText(answer1,"I like it a lot");
    }

    public void createAnswer2(){

        BrowserUtils.enterText(answer2,"I like it");
    }

    public void createAnswer3(){

        BrowserUtils.enterText(answer3,"I do not like it");
    }

    public void clickOnSend(){

        BrowserUtils.clickOnElement(send);
    }

    public void createTopic(String string){
        BrowserUtils.enterText(topic,string);
    }

    public void createQuestions(String string){
        BrowserUtils.enterText(questions,string);
    }

    public void firstAnswer(String string){
        BrowserUtils.enterText(answer1,string);
    }

    public void secondAnswer(String string){
        BrowserUtils.enterText(answer2,string);
    }

    public void thirdAnswer(String string){
        BrowserUtils.enterText(answer3,string);
    }

    public void forthAnswer(String string){
        BrowserUtils.enterText(answer4,string);
    }








}
