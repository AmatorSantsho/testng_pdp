package com.epam.automation.testng.tests;


import com.epam.automation.testng.project.StringUtils;
import org.testng.Assert;
import org.testng.annotations.*;


public class StringUtilsTest extends BaseTest {
    private StringUtils stringUtils;
    private final String hello = "Hello";
    private final String world = "World";
    private final String expectedHello = "Hello World";
    private final String expectedReverse = "dlroW";
    private final String expectedGreatJob = "Great Job!";

    @BeforeMethod()
    public void setUp() throws Exception {
        System.out.println("Before method");
        stringUtils = new StringUtils();
    }

    @AfterMethod()
    public void tearDown() throws Exception {
        System.out.println("After method");
        stringUtils = null;
    }

    @Test()
    public void addHelloToStart() {
        Assert.assertEquals(expectedHello, stringUtils.addHelloToStart(world));
    }

    @Test
    public void reverse() {
        Assert.assertEquals(expectedReverse, stringUtils.reverse(world));
    }

    @Test
    public void concat() {
        Assert.assertEquals(expectedHello, stringUtils.concat(hello, world));
    }

    @Test(dataProvider = "provider", dataProviderClass = DataProvider.class)
    public void parameterizedTest(String data1, String data2) {
        Assert.assertEquals(expectedHello, stringUtils.concat(data1, data2));
    }

    @Parameters({"firstString", "secondString"})
    @Test()
    public void passParametrFromXmlTest(String firstString, String secondString) {
        Assert.assertEquals(expectedGreatJob, stringUtils.concat(firstString, secondString));
    }

}