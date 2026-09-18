package tests;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerTest {

    public static void main(String[] args) {

        DriverFactory.createDriver();
        DriverFactory.getDriver().get("https://www.google.com");
        DriverFactory.quitDriver();
    }
}