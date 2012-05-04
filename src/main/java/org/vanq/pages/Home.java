package org.vanq.pages;

import org.openqa.selenium.WebDriver;

public class Home extends AbstractPageObject {

    public Home(WebDriver driver) {
        super(driver);
    }

    @Override
    protected String getExpectedH2Content() {
        return "Welcome to VANQ.org";
    }

}
