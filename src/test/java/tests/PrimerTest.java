package tests;

import base.BaseTest;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrimerTest extends BaseTest {

    @Test
    public void abrirGooGle(){
        DriverFactory.getDriver().get("https://www.google.com");
        System.out.printf("URL: " + DriverFactory.getDriver().getCurrentUrl());
    }
}