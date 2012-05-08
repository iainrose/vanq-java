package org.vanq.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.vanq.pages.Home;
import org.vanq.pages.Meetings;
import org.vanq.pages.Mission;
import org.vanq.pages.Sponsors;

public class NavBar {

    WebDriver driver;

    public NavBar(WebDriver driver) {
        this.driver = driver;
    }

    By homeTabLocator = By.cssSelector("img[alt=Home]");
    By meetingsTabLocator = By.cssSelector("img[alt=Meetings]");
    By missionTabLocator = By.cssSelector("img[alt=Mission]");
    By sponsorTabLocator = By.cssSelector("img[alt=Sponsors]");

    public Home clickHomeTab() {
        WebElement homeTab = driver.findElement(homeTabLocator);
        homeTab.click();
        return new Home(driver);
    }

    public Meetings clickMeetingsTab() {
        WebElement meetingsTab = driver.findElement(meetingsTabLocator);
        meetingsTab.click();
        return new Meetings(driver);
    }

    public Mission clickMissionTab() {
        WebElement missionTab = driver.findElement(missionTabLocator);
        missionTab.click();
        return new Mission(driver);
    }

    public Sponsors clickSponsorsTab() {
        WebElement sponsorTab = driver.findElement(sponsorTabLocator);
        sponsorTab.click();
        return new Sponsors(driver);
    }
}
