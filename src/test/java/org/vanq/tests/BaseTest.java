package org.vanq.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static final String BASE_URL = System.getProperty("BASE_URL", "http://www.vanq.org/");
    protected static final String BROWSER = System.getProperty("BROWSER", "firefox");
    protected static final boolean REMOTE_WEB_DRIVER = Boolean.valueOf(System.getProperty("REMOTE_WEB_DRIVER", "false"));
    protected static final String SELENIUM_HOST = System.getProperty("SELENIUM_HOST", "localhost");
    protected static final int SELENIUM_PORT = Integer.valueOf(System.getProperty("SELENIUM_PORT", "4444"));

    protected static RemoteWebDriver driver;
//    protected final Pages pages;

/*
    public BaseTest() {
        this.pages = new Pages();
    }*/

    //Runs once before all tests in test class
    @BeforeClass(alwaysRun = true)
    public void setupWebDriver() throws MalformedURLException {
        if (REMOTE_WEB_DRIVER) {
            setupRemoteWebDriver();
            driver.setFileDetector(new LocalFileDetector());
        } else {
            setupLocalWebDriver();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //Runs before each test method in test class
    @BeforeMethod(alwaysRun = true)
    public void loadLandingPage() {
        driver.get(BASE_URL);
    }

    //Runs after each test method in test class
    @AfterMethod(alwaysRun = true)
    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }

    //Runs once after all tests in test class
    @AfterClass(alwaysRun = true)
    public void suiteTearDown() {
        driver.quit();
    }

    //Sets up Remote WebDriver session, requires Selenium Server running
    private void setupRemoteWebDriver() throws MalformedURLException {
        DesiredCapabilities capabilities;
        if (BROWSER.equals("firefox")) {
            capabilities = DesiredCapabilities.firefox();
        } else if (BROWSER.equals("internetExplorer")) {
            capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        } else if (BROWSER.equals("chrome")) {
            capabilities = DesiredCapabilities.chrome();
        } else {
            throw new RuntimeException("Browser type unsupported:" + BROWSER);
        }
        driver = new RemoteWebDriver(
                new URL("http://" + SELENIUM_HOST + ":" + SELENIUM_PORT + "/wd/hub"),
                capabilities);
    }

    //Sets up local WebDriver session, does not require Selenium Server
    private void setupLocalWebDriver() {
        DesiredCapabilities capabilities;
        if (BROWSER.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (BROWSER.equals("internetExplorer")) {
            capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            driver = new InternetExplorerDriver(capabilities);
        } else if (BROWSER.equals("chrome")) {
            String chromeDriverPath = "lib/chromedriver";
            if (System.getProperty("os.name").contains("Windows")) {
                chromeDriverPath = "lib/chromedriver.exe";
            }
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
        } else {
            throw new RuntimeException("Browser type unsupported" + BROWSER);
        }
    }

}