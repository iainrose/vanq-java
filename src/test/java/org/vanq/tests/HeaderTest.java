package org.vanq.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.vanq.pages.Home;

public class HeaderTest extends BaseTest {

    @Test(groups = {"functional"})
    public void isLogoDisplayedTest() {
        driver.get(WEB_SERVER);
        Home homePage = new Home(driver);
        Assert.assertTrue(homePage.isVanqLogoDisplayed());
    }

}
