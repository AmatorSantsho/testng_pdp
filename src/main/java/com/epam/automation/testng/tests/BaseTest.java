package com.epam.automation.testng.tests;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Date;


public abstract class BaseTest {
    private static long startTime;



    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Tests started...");
        startTime = new Date().getTime();

    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Tests evaluation is done.");
        System.out.println("Duration time is " + (new Date().getTime() - startTime) + "ms");
    }
}
