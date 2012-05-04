package org.vanq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public abstract class AbstractPageObject {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public AbstractPageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = (new WebDriverWait(driver, 60));
        waitForPageToLoad();
        assertPageIsLoaded();
    }

    // Each page object must implement this method to return the content of the first <H2> tag on that page.
    // This will be used to assert that the current page has finished loading
    protected abstract String getExpectedH2Content();

    private void waitForPageToLoad() {
        // Wait until the content of the first H2 tag visible in the browser matches our expected value.
        // This helps make sure the page is loaded before the next step of the test continues.
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                String actualH2Content = d.findElement(By.cssSelector("h2")).getText();
                return actualH2Content.equals(getExpectedH2Content());
            }
        });
    }

    protected void assertPageIsLoaded() {
        // Assert that the content of the first H2 tag in the current page patches the expected content
        String actualH2Content = driver.findElement(By.cssSelector("h2")).getText();
        Assert.assertEquals(actualH2Content, getExpectedH2Content());
    }

}
