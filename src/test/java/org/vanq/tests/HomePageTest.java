package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.pages.Home;

public class HomePageTest extends BaseTest {

    @Test(groups = {"functional"})
    public void navigateToPresenterBiosPage() {
        Home home = new Home(driver);
        home.clickPresenterBios();
    }

}
