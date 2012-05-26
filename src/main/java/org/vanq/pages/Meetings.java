package org.vanq.pages;

import org.openqa.selenium.WebDriver;

public class Meetings extends AbstractBasePage {

    public Meetings(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getExpectedPageName() {
        return "Past Meetings and Materials";
    }
}
