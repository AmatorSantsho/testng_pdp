package com.epam.automation.testng.tests;


import com.epam.automation.testng.project.IntegerUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class IntegerUtilsTest extends BaseTest {
    private IntegerUtils integerUtils;
    private final int a = 6;
    private final int b = 2;
    private final int expectedSum = 8;
    private final int expectedDevide = 3;
    private final int expectedMultiple = 12;

    @BeforeMethod()
    public void setUp() throws Exception {
        System.out.println("Before method");
        integerUtils = new IntegerUtils();
    }

    @AfterMethod()
    public void cleanUp() throws Exception {
        System.out.println("After method");
        integerUtils = null;
    }
    @Test(timeOut = 100)
    public void sum() {
        Assert.assertEquals(expectedSum, integerUtils.sum(a, b));
        try {
            Thread.sleep(120);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test()
    public void divide() {
        int s = 5 / 0;
        Assert.assertEquals(expectedDevide, integerUtils.divide(a, b));
    }

    @Test()
    public void multiple() {
        Assert.assertEquals(expectedMultiple, integerUtils.multiple(a, b));
    }

    @Test()
    public void testWithSeveralVerifications() {

    }

    @Test()
    public void failByTimeout() {
        try {
            Thread.sleep(120);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(expectedMultiple, integerUtils.multiple(a, b));
    }


}