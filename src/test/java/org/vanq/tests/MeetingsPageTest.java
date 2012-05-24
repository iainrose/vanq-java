package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.pages.Meetings;
import org.vanq.sitemap.Pages;

public class MeetingsPageTest extends BaseTest {

    @Test(groups = {"content"})
    public void april262012PresenterTest() {
        driver.get(BASE_URL + Pages.meetings);
        Meetings meetings = new Meetings(driver);
    }
}
