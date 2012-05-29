package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.SiteMap;
import org.vanq.pages.Meetings;

public class MeetingsPageTest extends BaseTest {

    @Test(groups = {"content"})
    public void april262012PresenterTest() {
        
        // This test loads the meetings page directly so that navigational issues from the home page do not fail the test
        driver.get(BASE_URL + SiteMap.meetings);
        Meetings meetings = new Meetings(driver);
    }
}
