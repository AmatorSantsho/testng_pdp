package com.epam.automation.testng.tests;

public class CustomException extends RuntimeException {
    public CustomException() {
        super("Something went wrong...");
    }
}
