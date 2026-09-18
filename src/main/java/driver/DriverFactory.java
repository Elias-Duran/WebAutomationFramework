package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static void createDriver(){
        driver= new ChromeDriver();
    }
    public static WebDriver getDriver(){
        return driver;
    }
    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}