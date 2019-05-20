package org.automation.testingworld.testcases;
import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_001_ValidateLoginFunctionality extends DriverInstance{

    @Test
    public void tc_001_login_functionality() throws Exception{
        LoginPage login = new LoginPage(driver);
        login.enterUsername("Uname1");
        login.enterPassword("pass1");
        login.clickSignin();
    }
}
