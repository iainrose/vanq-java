package org.vanq.tests;

import org.testng.annotations.Test;
import org.vanq.pages.Home;
import org.vanq.pages.PresenterBios;

public class HomePageTest extends BaseTest {

    @Test(groups = {"functional"})
    public void navigateToPresenterBiosPage() {
        Home home = new Home(driver);
        PresenterBios presenterBios = home.clickPresenterBios();
    }

}
