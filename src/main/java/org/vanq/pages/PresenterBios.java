package org.vanq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.vanq.pages.bios.IainRoseBio;

public class PresenterBios extends AbstractPageObject {
    public PresenterBios(WebDriver driver) {
        super(driver);
    }

    @Override
    protected String getExpectedH2Content() {
        return "Who's Who of VANQ Presenters";
    }

    By iainRoseLocator = By.linkText("Iain Rose");

    public IainRoseBio clickPresenterIainRose() {
        WebElement presenter = driver.findElement(iainRoseLocator);
        presenter.click();
        return new IainRoseBio(driver);
    }
}
