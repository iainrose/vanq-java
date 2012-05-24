package org.vanq.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {

    WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    By vanqLogo = By.cssSelector("img[alt='VANQ']");

    public boolean isVanqLogoDisplayed() {
        return driver.findElements(vanqLogo).size() > 0;
    }
}
