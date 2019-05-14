package com.epam.automation.testng.tests;

import org.testng.IConfigurationListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

public class MyConfigurationListener implements IConfigurationListener {
MyListener listener = new MyListener();
    @Override
    public void onConfigurationSuccess(ITestResult iTestResult) {
        listener.onTestFailure(iTestResult);
    }

    @Override
    public void onConfigurationFailure(ITestResult iTestResult) {


    }

    @Override
    public void onConfigurationSkip(ITestResult iTestResult) {

    }
}
