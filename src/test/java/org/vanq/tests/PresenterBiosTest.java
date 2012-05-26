package org.vanq.tests;

import junit.framework.Assert;
import org.testng.annotations.Test;
import org.vanq.pages.Home;
import org.vanq.pages.PresenterBios;
import org.vanq.pages.bios.IainRoseBio;

public class PresenterBiosTest extends BaseTest {

    @Test(groups = {"content"})
    public void verifyIainRose31MayPresentationNameTest() {

        // Test Data
        String expectedPresentationName = "Selenium in the real world (or where are the tests and how do I run them?)";
        String presentationDate = "May. 31, 2012:";

        // Navigate to Iain Rose's bio page
        Home home = new Home(driver);
        PresenterBios presenterBios = home.clickPresenterBios();
        IainRoseBio iainRoseBio = presenterBios.clickPresenterIainRose();

        // Get the displayed presentation name
        String actualPresentationName = iainRoseBio.getPresentationNameForDate(presentationDate);

        Assert.assertEquals(expectedPresentationName, actualPresentationName);
    }

}
