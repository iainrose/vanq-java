package org.vanq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.vanq.pages.bios.IainRoseBio;

public class PresenterBios extends AbstractBasePage {

    public PresenterBios(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getExpectedPageName() {
        return "Who's Who of VANQ Presenters";
    }

    // Locators
    By iainRoseLocator = By.linkText("Iain Rose");

    // Public methods for page object
    public IainRoseBio clickPresenterIainRose() {
        WebElement presenter = driver.findElement(iainRoseLocator);
        presenter.click();
        return new IainRoseBio(driver);
    }
}
