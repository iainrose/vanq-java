package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.pages.Meetings;

public class MeetingsPageTest extends BaseTest {

    @Test(groups = {"content"})
    public void april262012PresenterTest() {
        driver.get(WEB_SERVER+pages.meetings);
        Meetings meetings = new Meetings(driver);
    }



}
