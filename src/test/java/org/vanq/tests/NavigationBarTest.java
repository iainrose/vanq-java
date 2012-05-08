package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.pages.Home;

public class NavigationBarTest extends BaseTest {

    @Test(groups = {"functional", "smoke"})
    public void clickHomeTabTest() {
        driver.get(WEB_SERVER);
        Home homePage = new Home(driver);
        homePage.clickHomeTab();
    }

    @Test(groups = {"functional", "smoke"})
    public void clickMeetingsTabTest() {
        driver.get(WEB_SERVER);
        Home homePage = new Home(driver);
        homePage.clickMeetingsTab();
    }

    @Test(groups = {"functional", "smoke"})
    public void clickMissionTabTest() {
        driver.get(WEB_SERVER);
        Home homePage = new Home(driver);
        homePage.clickMissionTab();
    }

    @Test(groups = {"functional", "smoke"})
    public void clickSponsorTabTest() {
        driver.get(WEB_SERVER);
        Home homePage = new Home(driver);
        homePage.clickSponsorsTab();
    }

}