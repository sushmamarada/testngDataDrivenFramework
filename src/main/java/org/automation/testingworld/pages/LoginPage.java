package org.automation.testingworld.pages;

import org.automation.testingworld.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterUsername(String uname) throws IOException {
        driver.findElement(By.id(Utility.fetchPropertyValue("login_username_id", "Elements.properties")));
    }
    public void enterPassword(String pass) throws IOException {
        driver.findElement(By.id(Utility.fetchPropertyValue("login_password_id", "Elements.properties")));
    }
    public  void clickSignin() throws IOException {
        driver.findElement(By.xpath(Utility.fetchPropertyValue("login_signin_xpath", "Elements.properties"))).click();
    }
}
