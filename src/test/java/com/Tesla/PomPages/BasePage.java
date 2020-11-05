package com.Tesla.PomPages;

import com.Tesla.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }







}
