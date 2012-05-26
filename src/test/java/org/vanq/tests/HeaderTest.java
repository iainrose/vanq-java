package org.vanq.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.vanq.pages.Home;

public class HeaderTest extends BaseTest {

    @Test(groups = {"functional"})
    public void vanqLogoDisplayedOnHomePageTest() {
        Home home = new Home(driver);
        Assert.assertFalse(home.isVanqLogoDisplayed());
    }

}
