package com.epam.automation.testng;


import com.epam.automation.testng.tests.IntegerUtilsTest;
import com.epam.automation.testng.tests.MyListener;
import com.epam.automation.testng.tests.StringUtilsTest;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<>();
        suites.add("src/main/resources/suite.xml");
        testNG.setTestSuites(suites);
        testNG.run();
    }

}
