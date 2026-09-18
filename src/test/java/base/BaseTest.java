package base;

import driver.DriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setup(){
        DriverFactory.createDriver();
    }
    @AfterMethod
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
