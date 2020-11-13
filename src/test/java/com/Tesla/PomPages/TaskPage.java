package com.Tesla.PomPages;

import com.Tesla.utils.BrowserUtils;
import com.Tesla.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskPage extends BasePage {



    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']//span")
    private WebElement task;

    @FindBy(xpath = "//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']")
    private WebElement title;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'][@class='task-options-inp'])[1]")
    private WebElement calendar;

    @FindBy(xpath = "//*[@class='bx-calendar-month'][3]")
    private WebElement month;

    @FindBy(xpath = "(//*[@class='bx-calendar-cell'])[15]")
    private WebElement day;

    @FindBy(xpath = "(//*[@class='bx-calendar-button-text'])[1]")
    private WebElement select;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    private WebElement send;

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    public void clickOnTask() {
        wait.until(ExpectedConditions.elementToBeClickable(task)).click();
    }

    public void createTitle() {
        BrowserUtils.enterText(title, "NEWROZ");
    }

    public void clickOnCalendar() {
        wait.until(ExpectedConditions.elementToBeClickable(calendar)).click();
    }

    public void clickOnMonth() {
        wait.until(ExpectedConditions.elementToBeClickable(month)).click();
    }

    public void clickOnDay() {
        wait.until(ExpectedConditions.elementToBeClickable(day)).click();
    }

    public void clickOnSelect() {
        wait.until(ExpectedConditions.elementToBeClickable(select)).click();
    }

    public void clickOnSend(){
        wait.until(ExpectedConditions.elementToBeClickable(send));
    }

    public void verifyTitle(String arg0) {

        String expectedTitle="NEWROZ";
        String actualTitle = Driver.getDriver().findElement(By.xpath("//*[.='NEWROZ']")).getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
