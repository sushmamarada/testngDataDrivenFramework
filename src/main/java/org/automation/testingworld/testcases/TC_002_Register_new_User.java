package org.automation.testingworld.testcases;

import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.datagenerators.datagenerator;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_002_Register_new_User extends DriverInstance {

    @Test(dataProvider = "Excel",dataProviderClass = datagenerator.class)
    public void TC_002_register_new_user(String fname,String lname,String pnumber) throws IOException
    {
        LoginPage login = new LoginPage(driver);
        login.enterFirstname(fname);
        login.enterLastname(lname);
        login.enterMobilenumber(pnumber);
    }
}

