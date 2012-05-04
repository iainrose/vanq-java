package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.pages.Home;
import org.vanq.pages.Pages;

public class HomePageTests extends BaseTest {

    @Test(groups = {"functional","smoke"})
    public void clickQuestionsTest() {
        driver.get(WEB_SERVER);
        Home homePage = new Home(driver);
    }

    @Test(groups = {"functional"})
    public void isLogoDisplayedTest() {
        driver.get(WEB_SERVER);
        Home homePage = new Home(driver);
    }

}