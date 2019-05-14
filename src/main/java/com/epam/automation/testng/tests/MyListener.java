package com.epam.automation.testng.tests;

import org.testng.*;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


public class MyListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        if ("sum".equals(iTestResult.getName())) {
            afterSpecificMethod();
        }
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        iTestResult.getThrowable().printStackTrace();
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    public void afterSpecificMethod() {
        System.out.println("afterSpecificMethod");
    }
}
