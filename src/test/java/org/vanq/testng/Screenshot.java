package org.vanq.testng;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.vanq.tests.BaseTest;

public class Screenshot extends TestListenerAdapter {

    @Override
    public void onConfigurationFailure(ITestResult itr) {
        BaseTest.screenshot();
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        //Method name = (tr.m_name).toString()
        BaseTest.screenshot();
    }

}
