package org.vanq.pages;

import org.openqa.selenium.WebDriver;

public class Mission extends AbstractBasePage {

    public Mission(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getExpectedPageName() {
        return "VANQ's Mission Statement";
    }

}
