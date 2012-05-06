package org.vanq.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.vanq.pages.Home;
import org.vanq.pages.Meetings;

public class NavBar {

    WebDriver driver;

    public NavBar(WebDriver driver) {
        this.driver = driver;
    }

    By homeTabLocator = By.cssSelector("img[alt=Home]");
    By meetingsTabLocator = By.cssSelector("img[alt=Meetings]");

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

}
