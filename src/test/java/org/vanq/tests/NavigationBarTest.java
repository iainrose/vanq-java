package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.pages.Home;

public class NavigationBarTest extends BaseTest {

    @Test(groups = {"functional", "smoke"})
    public void clickHomeTabOnHomePageTest() {
        Home homePage = new Home(driver);
        homePage.clickHomeTab();
    }

    @Test(groups = {"functional", "smoke"})
    public void clickMeetingsTabOnHomePageTest() {
        Home homePage = new Home(driver);
        homePage.clickMeetingsTab();
    }

    @Test(groups = {"functional", "smoke"})
    public void clickMissionTabOnHomePageTest() {
        Home homePage = new Home(driver);
        homePage.clickMissionTab();
    }

    @Test(groups = {"functional", "smoke"})
    public void clickSponsorTabOnHomePageTest() {
        Home homePage = new Home(driver);
        homePage.clickSponsorsTab();
    }

}