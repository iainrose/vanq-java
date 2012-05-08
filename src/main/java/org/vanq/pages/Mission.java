package org.vanq.pages;

import org.openqa.selenium.WebDriver;

public class Mission extends AbstractPageObject {

    public Mission(WebDriver driver) {
        super(driver);
    }

    @Override
    protected String getExpectedH2Content() {
        return "VANQ's Mission Statement";
    }
}
