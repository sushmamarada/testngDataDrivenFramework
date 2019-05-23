package org.automation.testingworld.base;

import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

public class DriverInstance {
    public WebDriver driver;

    @BeforeMethod
    public void initiateDriverInstance() throws IOException {
        if(Utility.fetchPropertyValue("browserName","config.properties").equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
            driver = new ChromeDriver();
        }
        else if(Utility.fetchPropertyValue("browserName", "config.properties").equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
            driver = new FirefoxDriver();
        }
        else if(Utility.fetchPropertyValue("browserName", "config.properties").equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.chrome.driver", "./Driver/geckodriver");
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
            driver = new ChromeDriver();
        }
        driver.get(Utility.fetchPropertyValue("applicationURL","config.properties"));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeDriverInstance()
    {
        driver.quit();
    }
}
