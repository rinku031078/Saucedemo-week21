package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * By Anand Tripathi
 **/
public class LastPage extends Utility {
    private static final Logger log = LogManager.getLogger(LastPage.class.getName());

    @FindBy(css = ".complete-header")
    WebElement thankMessage;

    public String verifyMessage(){
        log.info("Getting confirmation text to confirm Order "+thankMessage.toString());
        return thankMessage.getText();
    }
}
