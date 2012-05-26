package org.vanq.testng;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.vanq.tests.BaseTest;

public class Listener extends TestListenerAdapter {

    // Takes a screenshot if a @BeforeClass / @BeforeMethod method fails
    @Override
    public void onConfigurationFailure(ITestResult itr) {
        BaseTest.takeScreenshot(itr.getName());
    }

    // Takes a screenshot if a @Test method fails
    @Override
    public void onTestFailure(ITestResult tr) {
        BaseTest.takeScreenshot(tr.getName());
    }

}
