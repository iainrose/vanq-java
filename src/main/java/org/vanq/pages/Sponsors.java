package org.vanq.pages;

import org.openqa.selenium.WebDriver;

public class Sponsors extends AbstractPageObject {

    public Sponsors(WebDriver driver) {
        super(driver);
    }

    @Override
    protected String getExpectedH2Content() {
        return "VANQ Sponsors";
    }
}
