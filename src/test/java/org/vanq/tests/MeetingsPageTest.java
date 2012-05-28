package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.SiteMap;
import org.vanq.pages.Meetings;

public class MeetingsPageTest extends BaseTest {

    @Test(groups = {"content"})
    public void april262012PresenterTest() {
        driver.get(BASE_URL + SiteMap.meetings);
        Meetings meetings = new Meetings(driver);
    }
}
