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
    public void enterUsername(String uname) throws IOException
    {
        driver.findElement(By.id(Utility.fetchPropertyValue("login_username_id", "Elements.properties"))).sendKeys(uname);
    }
    public void enterPassword(String pass) throws IOException
    {
        driver.findElement(By.id(Utility.fetchPropertyValue("login_password_id", "Elements.properties"))).sendKeys(pass);
    }
    public  void clickSignin() throws IOException
    {
        driver.findElement(By.xpath(Utility.fetchPropertyValue("login_signin_xpath", "Elements.properties"))).click();
    }
    public void enterFirstname(String firstName) throws IOException
    {
        driver.findElement(By.name(Utility.fetchPropertyValue("login_firstname_name", "Elements.properties"))).sendKeys(firstName);
    }
    public void enterLastname(String lastName) throws IOException
    {
        driver.findElement(By.name(Utility.fetchPropertyValue("login_lastname_name", "Elements.properties"))).sendKeys(lastName);
    }
    public  void enterMobilenumber(String mobileNumber) throws IOException
    {
        driver.findElement(By.xpath(Utility.fetchPropertyValue("login_mobilenumber_xpath", "Elements.properties"))).sendKeys(mobileNumber);
    }

}
