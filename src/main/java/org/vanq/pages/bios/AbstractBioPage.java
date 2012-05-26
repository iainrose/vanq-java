package org.vanq.pages.bios;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.vanq.pages.AbstractBasePage;
import org.vanq.pages.Meetings;

import java.util.List;

public abstract class AbstractBioPage extends AbstractBasePage {

    public AbstractBioPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    By presentationListLocator = By.cssSelector("blockquote li");
    By presentationLinkLocator = By.tagName("a");


    public Meetings clickPresentationForDate(String date) {
        WebElement presentationLink = getPresentationLinkForDate(date);
        presentationLink.click();
        return new Meetings(driver);
    }

    public String getPresentationNameForDate(String date) {
        WebElement presentationLink = getPresentationLinkForDate(date);
        return presentationLink.getText();
    }

    // Always make methods that return WebElement objects private, WebElements should not be exposed to the tests
    private WebElement getPresentationLinkForDate(String date) {
        // Get all presentations displayed on the current bio
        List<WebElement> presentations = driver.findElements(presentationListLocator);

        // Iterate through each presentation until we find the date we are looking for
        for (WebElement presentation : presentations) {
            if (presentation.getText().contains(date)) {
                return presentation.findElement(presentationLinkLocator);
            }
        }
        // Throw exception if we check all presentations without making a match
        throw new NoSuchElementException("Presentation not found for " + date);
    }
}
