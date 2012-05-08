package org.vanq.pages;

import org.openqa.selenium.WebDriver;
import org.vanq.components.Header;
import org.vanq.components.NavBar;

public class Home extends AbstractPageObject {

    public Home(WebDriver driver) {
        super(driver);
    }

    private NavBar navBar = new NavBar(driver);
    private Header header = new Header(driver);

    @Override
    protected String getExpectedH2Content() {
        return "Welcome to VANQ.org";
    }

    public Home clickHomeTab() {
        return navBar.clickHomeTab();
    }

    public Meetings clickMeetingsTab() {
        return navBar.clickMeetingsTab();
    }

    public Mission clickMissionTab() {
        return navBar.clickMissionTab();
    }

    public Sponsors clickSponsorsTab() {
        return navBar.clickSponsorsTab();
    }

    public boolean isVanqLogoDisplayed() {
        return header.isVanqLogoDisplayed();
    }

}
