package org.vanq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.vanq.components.Header;
import org.vanq.components.NavBar;

public class Home extends AbstractPageObject {

    public Home(WebDriver driver) {
        super(driver);
    }

    //Reusable components
    private NavBar navBar = new NavBar(driver);
    private Header header = new Header(driver);

    //Define the text we will search for on each page load to assert we are on the expected page
    @Override
    protected String getExpectedH2Content() {
        return "Welcome to VANQ.org";
    }

    //Define locator's for page elements
    By presenterBiosLocator = By.linkText("Presenter Bios");

    //Define public methods
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

    public PresenterBios clickPresenterBios() {
        WebElement presenterBios = driver.findElement(presenterBiosLocator);
        presenterBios.click();
        return new PresenterBios(driver);
    }

}
