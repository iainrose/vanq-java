package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.pages.Home;

public class NavigationBarTest extends BaseTest {

    @Test(groups = {"functional", "smoke"})
    public void clickHomeTabTest() {
        Home homePage = new Home(driver);
        homePage.clickHomeTab();
    }

    @Test(groups = {"functional", "smoke"})
    public void clickMeetingsTabTest() {
        Home homePage = new Home(driver);
        homePage.clickMeetingsTab();
    }

    @Test(groups = {"functional", "smoke"})
    public void clickMissionTabTest() {
        Home homePage = new Home(driver);
        homePage.clickMissionTab();
    }

    @Test(groups = {"functional", "smoke"})
    public void clickSponsorTabTest() {
        Home homePage = new Home(driver);
        homePage.clickSponsorsTab();
    }

}