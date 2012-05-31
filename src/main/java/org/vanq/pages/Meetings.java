package org.vanq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Meetings extends AbstractBasePage {

    public Meetings(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getExpectedPageName() {
        return "Past Meetings and Materials";
    }

    // Locators
    By dateColumnLocator = By.cssSelector("td");
    By meetingsTableLocator = By.cssSelector("table table table");
    By presentationDetailsColumnLocator = By.cssSelector("td + td");
    By presenterNameLocator = By.cssSelector("a");

    public String getPresenterNameForDate(String date) {

        // Create WebElement for the meetings table
        WebElement meetingsTable = driver.findElement(meetingsTableLocator);

        // Get a list of all rows in the meetings table
        List<WebElement> tableRows = meetingsTable.findElements(By.tagName("tr"));

        // Iterate through the table rows
        for (WebElement tableRow : tableRows) {

            // Check for table rows containing presentation details by counting the columns in the row
            if (tableRow.findElements(By.tagName("td")).size() > 1) {

                // Get the column containing the presentation date
                WebElement dateColumn = tableRow.findElement(dateColumnLocator);

                // Get the date on the current table row
                String dateForRow = dateColumn.getText();

                // Check for a match on date
                if (dateForRow.equals(date)) {

                    // Get presentation details column
                    WebElement presentationDetailsColumn = tableRow.findElement(presentationDetailsColumnLocator);

                    // Get presenter name
                    return presentationDetailsColumn.findElement(presenterNameLocator).getText();

                }
            }
        }
        throw new NoSuchElementException("No presentation found for " + date);
    }
}
