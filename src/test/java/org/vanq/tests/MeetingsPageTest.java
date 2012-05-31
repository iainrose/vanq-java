package org.vanq.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.vanq.SiteMap;
import org.vanq.pages.Meetings;

public class MeetingsPageTest extends BaseTest {

    // These tests start on the meetings page
    // This is so that potential navigational issues from the home page do not impact the test
    // This also makes the tests faster as they do not need to load the home page at all
    @Override
    @BeforeMethod(alwaysRun = true)
    public void loadLandingPage() {
        driver.get(BASE_URL + SiteMap.meetings);
    }

    @Test(groups = {"content"})
    public void may312012PresenterTest() {

        // Test Data
        String date = "May. 31, 2012";
        String expectedPresenterName = "Iain Rose";
        
        // Initialize the meetings page object
        Meetings meetings = new Meetings(driver);

        // Get the presenter name for the 31 May 2012 meeting
        String actualPresenterName = meetings.getPresenterNameForDate(date);

        // Assert displayed presenter name is correct for given date
        Assert.assertEquals(actualPresenterName, expectedPresenterName);

    }

    @Test(groups = {"content"})
    public void april262012PresenterTest() {

        // Test Data
        String date = "Apr. 26, 2012";
        String expectedPresenterName = "Trevor Atkins";

        // Initialize the meetings page object
        Meetings meetings = new Meetings(driver);

        // Get the presenter name for the 26 April 2012 meeting
        String actualPresenterName = meetings.getPresenterNameForDate(date);

        // Assert displayed presenter name is correct for given date
        Assert.assertEquals(actualPresenterName, expectedPresenterName);

    }

    @Test(groups = {"content"})
    public void march292012PresenterTest() {

        // Test Data
        String date = "Mar. 29, 2012";
        String expectedPresenterName = "Brent Cromarty";

        // Initialize the meetings page object
        Meetings meetings = new Meetings(driver);

        // Get the presenter name for the 29 March 2012 meeting
        String actualPresenterName = meetings.getPresenterNameForDate(date);

        // Assert displayed presenter name is correct for given date
        Assert.assertEquals(actualPresenterName, expectedPresenterName);

    }

}
