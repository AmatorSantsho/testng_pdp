package com.epam.automation.testng.tests;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "provider")
    public static Object[][] dataProviderWithTwoParameters() {
        return new Object[][]{{"Hello", "World"}};
    }

}
